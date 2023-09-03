package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.Result;
import com.example.pojo.pastMonth;

import java.time.LocalDate;
import java.util.List;

public interface pastMonthService extends IService<pastMonth> {
     List<pastMonth> list();
     Result getByID(LocalDate date);

}
