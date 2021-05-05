package com.sxl.itheimaspringbootredis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class ItheimaSpringbootRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testSet() {
        // 存入数据
        redisTemplate.boundValueOps("name").set("zhang-San");

    }

    @Test
    public void testGet(){
        // 获取数据
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);

    }

}
