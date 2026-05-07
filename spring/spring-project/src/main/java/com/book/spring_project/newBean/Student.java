package com.book.spring_project.newBean;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public String name;
    public int age;

    public Student() {
        this.name = "John Doe";
        this.age = 20;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
