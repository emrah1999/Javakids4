package com.spring.elave.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class User { //user
    public User(){
        System.out.println("User bean is created");
    }
    public User(String name){
        System.out.println("User bean is created with name: " + name);
    }
}
