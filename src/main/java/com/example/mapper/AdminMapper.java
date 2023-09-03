package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
    @Select("select * from admin where username=#{username} and password=#{password}")
    Admin getByUsernameAndPassword(String username,String password);
}
