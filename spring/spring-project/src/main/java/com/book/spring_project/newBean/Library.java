package com.book.spring_project.newBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Library {
    public String name;
    public String location;

    public Library() {
        this.name = "National Library";
        this.location = "Baku";
    }

    @PostConstruct
    public void init() {
        System.out.println("Library bean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Library bean is being destroyed");
    }
}
