package com.udemy.herry.learn.microservices.client.lab7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class Lab7SentenceServer {
   public static void main(String[] args) {
        SpringApplication.run(Lab7SentenceServer.class, args);
    }
}
