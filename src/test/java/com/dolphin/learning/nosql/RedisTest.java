package com.dolphin.learning.nosql;

import com.dolphin.learning.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisTest extends BaseTest {

    @Autowired
    private RedisTemplate redisTemplate;

    public void test(){
//        redisTemplate.getV
    }
}
