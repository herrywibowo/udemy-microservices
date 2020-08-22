package com.udemy.herry.learn.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab6ConfigServerApp {
    public static void main(String[] args) {
        SpringApplication.run(Lab6ConfigServerApp.class, args);
    }
}
