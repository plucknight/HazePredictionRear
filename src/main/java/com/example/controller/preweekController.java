package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.preweek;
import com.example.pojo.realtime;
import com.example.service.preweekService;
import com.example.service.realtimeService;
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
@RequestMapping("preweek")
public class preweekController {
    @Autowired
    private com.example.service.preweekService preweekService;
    @GetMapping
    public Result list(){
        log.info("预测未来一周数据");
        List<preweek> deptList= preweekService.list();
        return Result.success(GET_OK,deptList);
    }
}