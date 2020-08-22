package com.udemy.herry.learn.microservices.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/sentence")
    public @ResponseBody
    String getSentence() {
        return
                getWord("LAB-5-SUBJECT") + " "
                        + getWord("LAB-5-VERB") + " "
                        + getWord("LAB-5-ARTICLE") + " "
                        + getWord("LAB-5-ADJECTIVE") + " "
                        + getWord("LAB-5-NOUN") + "."
                ;
    }

    public String getWord(String service) {
        return restTemplate.getForObject("http://" + service, String.class);
    }
}
