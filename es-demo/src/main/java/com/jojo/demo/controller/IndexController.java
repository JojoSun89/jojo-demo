package com.jojo.demo.controller;

import com.jojo.demo.service.CrudService;
import com.jojo.demo.service.IndexService2;
import com.jojo.demo.service.MatchQueryService;
import com.jojo.demo.service.TermQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {

    @Resource
    private IndexService2 indexService2;
    @Resource
    private CrudService crudService;

    @GetMapping("/aaa")
    public void create(){
        indexService2.createIndex();
    }

    @GetMapping("/bbb")
    public void delete(){
        indexService2.deleteIndex();
    }

    @GetMapping("/test")
    public void test1(){
        crudService.addDocument();
        crudService.getDocumet();
        crudService.updateDocument();
        crudService.deleteDocument();
    }

    @Resource
    private TermQueryService termQueryService;

    @GetMapping("/search")
    public void search(){
        termQueryService.termQuery();
        termQueryService.termsQuery();
    }



    @Resource
    private MatchQueryService matchQueryService;
    @GetMapping("/match")
    public void match(){
        matchQueryService.matchAllQuery();
        System.out.println("--------------------------");
        matchQueryService.matchQuery();
        System.out.println("--------------------------");
        matchQueryService.matchPhraseQuery();
        System.out.println("--------------------------");
        matchQueryService.matchMultiQuery();
    }

}

