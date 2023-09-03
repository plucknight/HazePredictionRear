### 介绍

一个基于Spring Boot、MyBatis Plus、Redis等主流后端技术栈的雾霾检测系统，采用了经典的SSM（Spring+Spring MVC+MyBatis）架构。该系统完全开源，适合快速上手和二次开发。

为了快速构建，mysql表中数据已放到data文件夹中

前端代码见: https://github.com/plucknight/HazePredictionFront

实现效果演示：https://www.bilibili.com/video/BV1Dp4y177Ja/?vd_source=106148829f4208e816e76f0b673079ad

使用Redis只实现了查询部分功能，吞吐量提高了约23倍

![image](https://github.com/plucknight/HazePredictionRear/assets/96863787/ef2a59d6-9510-4fde-9541-48d1cd7a2e26)


### 目录树
```
example
├── SciApplication.java
├── config
│   ├── JedisConfig.java
│   ├── JedisProperties.java
│   └── WebConfig.java
├── controller
│   ├── AdminController.java
│   ├── Code.java
│   ├── loginController.java
│   ├── pastmonthController.java
│   ├── preweekController.java
│   ├── readController.java
│   ├── realtimeController.java
│   ├── tfhourController.java
│   └── weekaqiController.java
├── exception
│   ├── BusinessException.java
│   ├── ProjectExceptionAdvice.java
│   └── SystemException.java
├── interceptor
│   └── LoginCheckInterceptor.java
├── mapper
│   ├── AdminMapper.java
│   ├── ShopMapper.java
│   ├── pastMonthMapper.java
│   ├── preweekMapper.java
│   ├── realtimeMapper.java
│   ├── tfhourMapper.java
│   └── weekaqiMapper.java
├── pojo
│   ├── Admin.java
│   ├── OperateLog.java
│   ├── Result.java
│   ├── Shop.java
│   ├── pastMonth.java
│   ├── preweek.java
│   ├── realtime.java
│   ├── tfhours.java
│   └── weekaqi.java
├── service
│   ├── AdminService.java
│   ├── ArticleService.java
│   ├── IShopService.java
│   ├── impl
│   │   ├── AdminServiceImpl.java
│   │   ├── ArticleServiceImpl.java
│   │   ├── pastMonthImpl.java
│   │   ├── preweekImpl.java
│   │   ├── realtimeImpl.java
│   │   ├── tfhourImpl.java
│   │   └── weekaqiImpl.java
│   ├── pastMonthService.java
│   ├── preweekService.java
│   ├── realtimeService.java
│   ├── tfhourService.java
│   └── weekaqiService.java
└── utils
    ├── CacheClient.java
    ├── JwtUtils.java
    ├── RedisConstants.java
    └── RedisData.java
```
