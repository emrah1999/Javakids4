package com.additional.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    public User userBean(){
        return new User("Arif");
    }

    @Bean
    @Primary
    public Address addressBean(){
        return new Address("Gence");
    }
}
