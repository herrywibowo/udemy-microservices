package com.udemy.herry.learn.microservices.eureka.client.lab6.controller;

import com.udemy.herry.learn.microservices.eureka.client.lab6.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Controller
public class SentenceController {

    @Autowired
    SentenceService sentenceService;


    /**
     * Display a small list of Sentences to the caller:
     */
    @GetMapping("/sentence")
    public @ResponseBody String getSentence() {
        return
                "<h3>Some Sentences</h3><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>"
                ;
    }

}
