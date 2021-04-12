package com.wolfjc.bloom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


@EnableCaching
@SpringBootApplication
@ComponentScan(value = "com.wolfjc")
public class BloomFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloomFilterApplication.class, args);
    }

}
