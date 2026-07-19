package com.spring.elave.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bank {
//    @Autowired
//    @Qualifier("user")
//    public User user;
    public Bank(User user){
        System.out.println("Bank bean is created with user: " + user);
    }
//    public void setUser(User user){
//        System.out.println("Bank bean is created with user: " + user);
//    }
}
