package com.lemon.macadamia;

import com.lemon.macadamia.common.property.JwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(JwtProperties.class)
@SpringBootApplication
public class MacadamiaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MacadamiaApiApplication.class, args);
    }

}
