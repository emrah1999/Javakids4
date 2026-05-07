package com.book.spring_project.DI;

import org.springframework.stereotype.Component;

@Component
public class Address {
    public String name;

    public Address() {
        this.name = "Baku, Azerbaijan";
    }
}
