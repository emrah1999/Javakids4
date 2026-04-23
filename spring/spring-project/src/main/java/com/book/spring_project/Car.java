package com.book.spring_project;

import org.springframework.stereotype.Component;

@Component
public class Car {  //bean car

    String brand;
    String model;

    public Car(){
        this.brand="BMW";
        this.model="X5";
    }
}
