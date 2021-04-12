package com.wolfjc.bloom;

import com.wolfjc.bloom.RedisBloomFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BloomFilterApplicationTests {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisBloomFilter redisBloomFilter;


    @Test
    public void contextLoads() {
//        stringRedisTemplate.opsForValue().set("hello","123456");

        for (int i=0 ;i<50 ;i++) {
            redisBloomFilter.put(String.valueOf(i));
        }
        System.out.println(redisBloomFilter.mightContain("40"));
    }

}
