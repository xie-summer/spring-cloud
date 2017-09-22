package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 启动类
 */
@SpringBootApplication
/** 在classpath 下 两种格式是相同的
 *  @EnableEurekaClient 更依赖于eureka注册中心
 *  @EnableDiscoveryClient 可以在eureka中心或者zk，consul.所以更通用
 *  */
@EnableDiscoveryClient
//@ComponentScan(basePackages="com.cloud")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
