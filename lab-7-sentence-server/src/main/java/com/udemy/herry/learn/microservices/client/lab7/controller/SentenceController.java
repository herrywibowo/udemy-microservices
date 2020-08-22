package com.udemy.herry.learn.microservices.client.lab7.controller;

import com.udemy.herry.learn.microservices.client.lab7.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
