package com.book.spring_project.DI;

import com.book.spring_project.SpringProjectApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);
        Client client=context.getBean(Client.class);
        System.out.println(client.name);

        System.out.println(client.address.name);
        System.out.println(client.school.name);


        ConstructorInjection constructorInjection=context.getBean(ConstructorInjection.class);

        constructorInjection.printInfo();



    }
}
