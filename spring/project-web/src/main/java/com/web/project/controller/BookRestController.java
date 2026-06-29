package com.web.project.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookRestController {


    @PostMapping
    public String addBook() { //requestbody
        return "Add a new book";
    }



}
