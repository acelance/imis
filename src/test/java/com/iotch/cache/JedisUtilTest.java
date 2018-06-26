package com.iotch.cache;

import com.iotch.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

public class JedisUtilTest extends BaseTest {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testRedisTemplate(){
        redisTemplate.opsForValue().set("lin", "acelance_lin");
        System.out.println("value："+redisTemplate.opsForValue().get("lin"));
    }

    @Test
    public void testRedisUtil(){
        redisUtil.set("lin","Acelance_Lin");
        System.out.println("VALUE:"+redisUtil.get("lin"));
    }
}
