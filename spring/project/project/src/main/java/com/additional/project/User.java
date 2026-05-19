package com.additional.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User { //user
    String name;

    @Autowired
    @Qualifier("address")
    Address address; //address


    public User(){
        System.out.println("User beani yaradildi");
    }

    public User(String name){
        this.name=name;
    }

    public void printAddress(){
        System.out.println("Userun addressi: "+address.address);
    }

    public void printAddress2(){
        System.out.println("Userun addressi 2: "+address.address);
    }
}
