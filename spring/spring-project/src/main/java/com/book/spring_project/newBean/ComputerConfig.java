package com.book.spring_project.newBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //computerConfig(beanin adi) classini configuration kimi qeyd edirik ve bu classda beanlerimizi elave edeceyik
public class ComputerConfig {

    @Bean
    public Computer computer1(){ //computer1 beaninin container elave edir
        return new Computer("Asus");
    }

    @Bean
    public Computer computer2(){ //computer2 beaninin container elave edir
        return new Computer("MacOS");
    }

    @Bean
    public Computer computer3(){ //computer3 beaninin container elave edir
        return new Computer("Acer");
    }
    
    @Bean
    public Library library(){ //library beaninin container elave edir
        return new Library();
    }

}
