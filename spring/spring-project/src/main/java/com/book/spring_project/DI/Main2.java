package com.book.spring_project.DI;

import com.book.spring_project.SpringProjectApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames) {
            System.out.println(bean);
        }

        Animal animal=context.getBean(Animal.class);
        System.out.println(animal.name);

        Zoopark zoopark=context.getBean(Zoopark.class);
        System.out.println(zoopark.animal.name);
    }
}
