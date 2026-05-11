package com.book.spring_project.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnimalConfig {
    @Bean
    @Primary
    public Animal animal2(){
        return new Animal("Tiger");
    }
}
