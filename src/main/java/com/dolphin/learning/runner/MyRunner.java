package com.dolphin.learning.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        if(args !=null && args.length>0){
            for(String arg : args){
                System.out.println("arg11111--------"+arg);
            }
        }

    }
}
