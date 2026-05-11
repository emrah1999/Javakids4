package com.book.spring_project.DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class School {
        public String name;

        public School() {
            this.name = "Baku State University";
        }
    public School(String name) {
        this.name = "Uni "+name;
    }
}
