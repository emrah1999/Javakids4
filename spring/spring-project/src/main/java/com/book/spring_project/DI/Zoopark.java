package com.book.spring_project.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoopark {

    @Autowired
    @Qualifier("animal")
    public Animal animal;

}
