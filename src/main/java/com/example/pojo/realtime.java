package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class realtime {
    private LocalDate date;

    private Double AQI;
    private String HazeLevel;
    private String mainPollut;
    private Double so2;
    private Double no2;
    private Double co;
    private Double o3;
    private Double pm2;
    private Double pm10;
    private String humidity;
    private String windDir;
    private Double windSpeed;
    private Double visibility;
}
