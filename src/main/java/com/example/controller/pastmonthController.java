package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.pastMonth;
import com.example.service.pastMonthService;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import static com.example.controller.Code.GET_OK;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("pastmonth")
public class pastmonthController {
    @Autowired
    private pastMonthService pastmonthService;
    @GetMapping
    public Result list(){
        log.info("查询过去一个月数据");
        List<pastMonth> deptList= pastmonthService.list();
        return Result.success(GET_OK,deptList);
    }
    public static class DateRequest {
        private String date;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
    @PostMapping("/search")
    public Result getByID(@RequestBody DateRequest request) {

        LocalDate date = LocalDate.parse(request.getDate());
        System.out.println("date = " + date);
        return pastmonthService.getByID(date);
    }
}
