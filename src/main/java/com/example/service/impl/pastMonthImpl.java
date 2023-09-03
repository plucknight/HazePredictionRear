package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.pastMonthMapper;
import com.example.pojo.Result;
import com.example.pojo.pastMonth;
import com.example.service.pastMonthService;
import com.example.utils.CacheClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.example.controller.Code.GET_ERR;
import static com.example.controller.Code.GET_OK;
import static com.example.utils.RedisConstants.*;

@Service
public class pastMonthImpl extends ServiceImpl<pastMonthMapper, pastMonth>  implements pastMonthService {
    @Autowired
    private pastMonthMapper pastMonthMapper;

    @Resource
    private CacheClient cacheClient;

    @Override
    public List<pastMonth> list() {
        return pastMonthMapper.list();
    }

    @Override
    public Result getByID(LocalDate date){
        pastMonth pastmonth  = cacheClient
                .queryWithPassThrough(CACHE_SEARCH_KEY, date, pastMonth.class,  LOCK_SEARCH_TTL, TimeUnit.MINUTES);
        if (pastmonth == null) {
            return Result.error(GET_ERR,"未录入该数据！");
        }
        return Result.success(GET_OK,pastmonth);}


}
