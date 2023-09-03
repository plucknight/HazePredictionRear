package com.example.mapper;

import com.example.pojo.pastMonth;
import com.example.pojo.preweek;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface preweekMapper {
    @Select("select * from preweek")
    List<preweek> list();
}
