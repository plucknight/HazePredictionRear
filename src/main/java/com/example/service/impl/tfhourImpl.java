package com.example.service.impl;

import com.example.mapper.tfhourMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pojo.tfhours;
import com.example.service.tfhourService;

import java.util.List;

@Service
public class tfhourImpl implements tfhourService {
    @Autowired
    private tfhourMapper tfhourMapper;

    @Override
    public List<tfhours> list() {
        return tfhourMapper.list();
    }
}
