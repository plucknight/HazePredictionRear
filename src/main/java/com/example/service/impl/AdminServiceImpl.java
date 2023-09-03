package com.example.service.impl;

import com.example.mapper.AdminMapper;
import com.example.pojo.Admin;
import com.example.service.AdminService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    public AdminMapper adminMapper;
    @Override
    public Admin login(String username,String password){
        return adminMapper.getByUsernameAndPassword(username, password);
    }
}
