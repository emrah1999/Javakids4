package com.additional.project;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
    private final Address address;

    public School(Address address) {
        this.address = address;
    }


    public void printAddress(){
        System.out.println("Schoolun addressi: "+address.address);
    }

    @PostConstruct
    public void init(){
        System.out.println("School beani yaradildi");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("School beani yox edildi");
    }
}
