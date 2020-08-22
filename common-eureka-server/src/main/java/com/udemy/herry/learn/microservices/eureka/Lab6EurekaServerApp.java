package com.udemy.herry.learn.microservices.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab6EurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(Lab6EurekaServerApp.class, args);
    }
}
