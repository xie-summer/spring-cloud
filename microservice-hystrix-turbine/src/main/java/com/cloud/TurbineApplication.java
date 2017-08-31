package com.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableTurbine
public class TurbineApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineApplication.class).web(true).run(args);
    }
}
