package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.pojo.tfhours;

import java.util.List;
@Mapper
public interface tfhourMapper {
    @Select("select * from 24hours")
    List<tfhours> list();
}
