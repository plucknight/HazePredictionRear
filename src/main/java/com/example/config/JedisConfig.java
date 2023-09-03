package com.example.config;

import com.example.config.JedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

@Configuration
public class JedisConfig {
    /**
     * jedis连接池
     * @param jedisProperties
     * @return
     */
    @Bean
    public JedisPool jedisPool(JedisProperties jedisProperties) {

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(jedisProperties.getMaxTotall());
        config.setMaxIdle(jedisProperties.getMaxIdle());
        config.setMinIdle(jedisProperties.getMinIdle());
        config.setMaxWait(Duration.ofMillis(jedisProperties.getMaxWaitMillis()));
        config.setTestOnBorrow(jedisProperties.isTestOnBorrow());
        config.setTestOnReturn(jedisProperties.isTestOnReturn());
        config.setTimeBetweenEvictionRuns(Duration.ofMillis(jedisProperties.getTimeBetweenEvictionRunsMillis()));
        config.setTestWhileIdle(jedisProperties.isTestWhileIdle());
        config.setNumTestsPerEvictionRun(jedisProperties.getNumTestsPerEvictionRun());

        if (StringUtils.hasText(jedisProperties.getPassword())) {
            return new JedisPool(config, jedisProperties.getHost(), jedisProperties.getPort(),
                    jedisProperties.getTimeout(), jedisProperties.getPassword());
        }
        return new JedisPool(config, jedisProperties.getHost(), jedisProperties.getPort(),
                jedisProperties.getTimeout());
    }
}
