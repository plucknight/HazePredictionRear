package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.tfhours;
import com.example.pojo.weekaqi;
import com.example.service.tfhourService;
import com.example.service.weekaqiService;
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
@RequestMapping("weekaqi")
public class weekaqiController {
    @Autowired
    private weekaqiService weekaqiService;
    @GetMapping
    public Result list(){
        log.info("查询一周aqi数据");
        List<weekaqi> deptList= weekaqiService.list();
        return Result.success(GET_OK,deptList);
    }
}
