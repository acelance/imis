package com.iotch.cache;

import com.iotch.BaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import com.iotch.cache.JedisUtil;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JedisUtilTest extends BaseTest {
    @Autowired
    private JedisUtil jedisUtil;
    @Autowired
    private JedisUtil.Strings jedisStrings;
    @Autowired
    private JedisUtil.Sets jedisSets;
    @Autowired
    private JedisUtil.Keys jedisKeys;

    @Test
    public void testRedis(){
        jedisStrings.set("a","123");

        System.out.println(jedisStrings.get("a"));
    }
}
