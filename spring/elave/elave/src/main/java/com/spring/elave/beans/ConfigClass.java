package com.spring.elave.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigClass {
    @Bean//userBean
    @Primary
    public User userBean(){
        return new User("John Doe");
    }
}
