package com.dolphin.learning.configproperty;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "myconfig")
@Component
@Data
public class MyConfig {

    private String name;
}
