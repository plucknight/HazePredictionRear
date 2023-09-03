package com.example.service.impl;

import com.example.mapper.tfhourMapper;
import com.example.mapper.weekaqiMapper;
import com.example.pojo.tfhours;
import com.example.pojo.weekaqi;
import com.example.service.weekaqiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class weekaqiImpl implements weekaqiService {
    @Autowired
    private weekaqiMapper weekaqiMapper;

    @Override
    public List<weekaqi> list() {
        return weekaqiMapper.list();
    }

}
