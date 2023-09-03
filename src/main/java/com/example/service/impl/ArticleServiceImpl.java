package com.example.service.impl;

import com.example.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private JedisPool jedisPool;
    @Override
    public Integer incr(Long id) {
        Jedis jedis = jedisPool.getResource();
        String key = "article_viewnum:" + id; // 构建键名
        Long increment = jedis.incr(key);

        jedis.close();
        return increment.intValue();
    }

}
