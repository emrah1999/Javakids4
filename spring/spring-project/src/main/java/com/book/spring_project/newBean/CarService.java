package com.book.spring_project.newBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CarService { //carSerice camel case yazilir cunki bu classin adi carService dir ve spring bunu camel case olaraq tanir

    public Engine engine;

    private final ApplicationContext context;

    public CarService(ApplicationContext context) {
        this.context = context;
    }

    public void startCar(){
        this.engine=context.getBean(Engine.class);
    }


}
