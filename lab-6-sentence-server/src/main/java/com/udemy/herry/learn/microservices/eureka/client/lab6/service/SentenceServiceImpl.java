package com.udemy.herry.learn.microservices.eureka.client.lab6.service;

import com.udemy.herry.learn.microservices.eureka.client.lab6.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    VerbClient verbService;
    SubjectClient subjectService;
    ArticleClient articleService;
    AdjectiveClient adjectiveService;
    NounClient nounService;


    /**
     * Assemble a sentence by gathering random words of each part of speech:
     */
    public String buildSentence() {
        String sentence = "There was a problem assembling the sentence!";
        sentence =
                String.format("%s %s %s %s %s.",
                        subjectService.getWord().getWord(),
                        verbService.getWord().getWord(),
                        articleService.getWord().getWord(),
                        adjectiveService.getWord().getWord(),
                        nounService.getWord().getWord());
        return sentence;
    }

    @Autowired
    public void setVerbService(VerbClient verbService) {
        this.verbService = verbService;
    }

    @Autowired
    public void setSubjectService(SubjectClient subjectService) {
        this.subjectService = subjectService;
    }

    @Autowired
    public void setArticleService(ArticleClient articleService) {
        this.articleService = articleService;
    }

    @Autowired
    public void setAdjectiveService(AdjectiveClient adjectiveService) {
        this.adjectiveService = adjectiveService;
    }

    @Autowired
    public void setNounService(NounClient nounService) {
        this.nounService = nounService;
    }

}
