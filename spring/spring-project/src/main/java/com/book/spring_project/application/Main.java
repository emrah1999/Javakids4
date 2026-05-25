package com.book.spring_project.application;

import com.book.spring_project.SpringProjectApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);
            OrdinaryClass ordinaryClass = context.getBean(OrdinaryClass.class);
            System.out.println(ordinaryClass.getProjectName());
        System.out.println(ordinaryClass.port);
        System.out.println(ordinaryClass.langs);
        System.out.println(ordinaryClass.activeStatus);


        MailProperties mailProperties = context.getBean(MailProperties.class);
        System.out.println(mailProperties);
        log.info("Mail Properties: {}", mailProperties);
        log.warn("Salam warning");
        log.error("Salam error");
        log.debug("Salam error");
    }
}
