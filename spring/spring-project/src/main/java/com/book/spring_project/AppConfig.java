package com.book.spring_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public User newUserBean(){ //newUserBean
        return new User();
    }
}
