package com.example.utils;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.example.mapper.pastMonthMapper;
import com.example.pojo.pastMonth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import static com.example.utils.RedisConstants.CACHE_NULL_TTL;

@Slf4j
@Component
public class CacheClient {
    @Autowired
    private pastMonthMapper pastMonthMapper;
    private final StringRedisTemplate stringRedisTemplate;


    public CacheClient(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public void set(String key, Object value, Long time, TimeUnit unit) {
        stringRedisTemplate.opsForValue().set(key, JSONUtil.toJsonStr(value), time, unit);
    }

    public pastMonth queryWithPassThrough(
            String keyPrefix, LocalDate date, Class<pastMonth> type, Long time, TimeUnit unit) {
        String key = keyPrefix + date;

        String json = stringRedisTemplate.opsForValue().get(key);
        if (StrUtil.isNotBlank(json)) {
            return JSONUtil.toBean(json, type);
        }
        if (json != null) {
            return null;
        }

        pastMonth r = pastMonthMapper.getByDate(date);
        if (r == null) {
            stringRedisTemplate.opsForValue().set(key, "", CACHE_NULL_TTL, TimeUnit.MINUTES);
            return null;
        }

        this.set(key, r, time, unit);
        return r;
    }
}
