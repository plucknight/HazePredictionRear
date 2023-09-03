package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.realtime;
import com.example.pojo.tfhours;
import com.example.service.realtimeService;
import com.example.service.tfhourService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.controller.Code.GET_OK;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("realtime")
public class realtimeController {
    @Autowired
    private realtimeService realtimeService;
    @GetMapping
    public Result list(){
        log.info("查询实时数据");
        List<realtime> deptList= realtimeService.list();
        return Result.success(GET_OK,deptList);
    }
}
