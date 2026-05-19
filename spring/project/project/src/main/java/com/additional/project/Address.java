package com.additional.project;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Address {
    String address;
    public Address(){
        this.address="Baku";
    }

    public Address(String name){
        this.address=name;
    }
}
