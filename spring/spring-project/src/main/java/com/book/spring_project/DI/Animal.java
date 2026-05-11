package com.book.spring_project.DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    public String name;
    public Animal(){
        this.name="Lion";
    }
    public Animal(String name){
        this.name=name;
    }
}
