package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mapper.pastMonthMapper;
import com.example.pojo.Result;
import com.example.pojo.pastMonth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.controller.Code.GET_OK;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private pastMonthMapper pastMonthMapper;
    public static class pageParm{
        Integer cur;
        Integer size;

        public Integer getCur() {
            return cur;
        }

        public void setCur(Integer cur) {
            this.cur = cur;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getSize() {
            return size;
        }
    }

    @PostMapping
    public Result testSelectPage(){
        IPage<pastMonth> page = new Page<>(0, 100);
        pastMonthMapper.selectPage(page,null);
        List <pastMonth> p=page.getRecords();
        return Result.success(GET_OK,p);
    }

}