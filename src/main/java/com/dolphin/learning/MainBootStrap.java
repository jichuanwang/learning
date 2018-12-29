package com.dolphin.learning;

import com.sun.javaws.Main;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainBootStrap {

    public static void main(String[] args) {
//        SpringApplication.run(MainBootStrap.class,args);
        SpringApplication application = new SpringApplication(MainBootStrap.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run("hello","wjc");
    }
}
