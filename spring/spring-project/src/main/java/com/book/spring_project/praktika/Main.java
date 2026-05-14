package com.book.spring_project.praktika;

import com.book.spring_project.SpringProjectApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames) {
            System.out.println(bean);
        }
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.processPayment();
    }
}
