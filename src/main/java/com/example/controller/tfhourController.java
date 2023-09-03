package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.pojo.Result;
import com.example.pojo.tfhours;
import com.example.service.tfhourService;

import java.util.List;

import static com.example.controller.Code.GET_OK;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("24hours")
public class tfhourController {
    @Autowired
    private tfhourService tfhourService;
    @GetMapping
    public Result list(){
        log.info("查询一天数据");
        List<tfhours> deptList= tfhourService.list();
        return Result.success(GET_OK,deptList);
    }
}
