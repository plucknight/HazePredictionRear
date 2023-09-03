package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class tfhours {
    private LocalDateTime date;
    private Double so2;
    private Double no2;
    private Double co;
    private Double o3;
    private Double pm25;
    private Double pm10;
}
