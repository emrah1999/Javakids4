package com.book.spring_project.newBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //her defe yeni bir bean yaradir
public class Engine {
        public String type;

        public Engine() {
            this.type = "V8";
            System.out.println("Engine created: " + type);
        }
}
