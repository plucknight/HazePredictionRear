package com.example.service.impl;

import com.example.mapper.pastMonthMapper;
import com.example.mapper.preweekMapper;
import com.example.pojo.pastMonth;
import com.example.pojo.preweek;
import com.example.service.preweekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class preweekImpl implements preweekService {
    @Autowired
    private preweekMapper preweekMapper;

    @Override
    public List<preweek> list() {
        return preweekMapper.list();
    }
}
