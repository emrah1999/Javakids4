package com.book.spring_project;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Car {  //bean car

    String brand;
    String model;

    public Car(){
        this.brand="BMW";
        this.model="X5";
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.brand+" "+car.model);
    }
}
