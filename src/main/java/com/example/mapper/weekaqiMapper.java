package com.example.mapper;

import com.example.pojo.tfhours;
import com.example.pojo.weekaqi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface weekaqiMapper {
    @Select("select * from weekaqi")
    List<weekaqi> list();
}
