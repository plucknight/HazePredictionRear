package com.example.mapper;

import com.example.pojo.realtime;
import com.example.pojo.tfhours;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface realtimeMapper {


        @Select("select * from realtime")
        List<realtime> list();
}
