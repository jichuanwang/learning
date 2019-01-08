package com.dolphin.learning.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfiguration {

    @Bean
    public Long getAge(){
        return 10L;
    }
}
