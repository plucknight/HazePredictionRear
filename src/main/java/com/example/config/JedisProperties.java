package com.example.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jedis.pool")
@Getter
@Setter
public class JedisProperties {
    private int  maxTotall;
    private int  maxIdle;
    private int  minIdle;
    private int  maxWaitMillis;
    private boolean  testOnBorrow;
    private boolean  testOnReturn;
    private int  timeBetweenEvictionRunsMillis;
    private boolean  testWhileIdle;
    private int  numTestsPerEvictionRun;

    private String host;
    private String password;
    private int port;
    private int timeout;
}