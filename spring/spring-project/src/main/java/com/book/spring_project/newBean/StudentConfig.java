package com.book.spring_project.newBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student student1(){ //student1 beaninin container elave edir
        return new Student("Alice", 22);
    }

    @Bean
    public Student student2(){ //student1 beaninin container elave edir
        return new Student("Nihat");
    }
}
