package com.udemy.herry.learn.microservices.client.lab7.dao;

import com.udemy.herry.learn.microservices.client.lab7.model.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("LAB-5-ADJECTIVE")
public interface AdjectiveClient {
    @GetMapping("/")
    public Word getWord();
}
