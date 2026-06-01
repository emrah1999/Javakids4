package com.book.spring_project.controller;

import com.book.spring_project.application.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexRestController {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    @GetMapping
    public String index(){
        return "Hello World";
    }

    @GetMapping("/salam")
    public String index2(){
        log.info("Salam");
        return "Salaaammmm";
    }


}
