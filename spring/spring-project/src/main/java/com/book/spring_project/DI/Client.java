package com.book.spring_project.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
    public String name;

    @Autowired
    public Address address;

    public School school;

    public Client() {
        this.name = "Teymur Eli";
    }

    @Autowired
    public void setSchool(School school) {
        this.school = school;
    }


}
