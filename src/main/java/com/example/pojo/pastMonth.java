package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("history")
public class pastMonth {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private Double so2;
    private Double no2;
    private Double co;
    private Double o3;
    private Double pm25;
    private Double pm10;
}
