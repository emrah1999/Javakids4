package com.book.spring_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainClass {

    @Bean
    public Book bookBean(){
        return new Book();
    }

    @Bean
    public User userBean(){
        return new User();
    }
}
