package com.book.spring_project;

import org.springframework.stereotype.Component;

@Component
public class User { //user
        String name;
        int age;

        public User(){
            this.name="John";
            this.age=30;
        }


}
