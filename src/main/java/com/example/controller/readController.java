package com.example.controller;

import com.example.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("article")
public class readController {
    @Autowired
    public ArticleService articleService;
    @PostMapping("/incr")
    public Integer incr(Long id){
        return articleService.incr(id);
    }
}
