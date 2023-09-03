package com.example.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.pastMonth;
import com.example.pojo.realtime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface pastMonthMapper extends BaseMapper<pastMonth> {
    @Select("select * from history")
    List<pastMonth> list();
    @Select("select * from history where date=#{date}" )
    pastMonth getByDate(LocalDate date);
}
