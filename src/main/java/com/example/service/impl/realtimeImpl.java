package com.example.service.impl;

import com.example.mapper.realtimeMapper;
import com.example.mapper.tfhourMapper;
import com.example.pojo.realtime;
import com.example.pojo.tfhours;
import com.example.service.realtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class realtimeImpl implements realtimeService {
    @Autowired
    private realtimeMapper realtimeMapper;

    @Override
    public List<realtime> list() {
        return realtimeMapper.list();
    }
}
