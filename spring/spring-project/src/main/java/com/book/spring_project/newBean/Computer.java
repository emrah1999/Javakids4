package com.book.spring_project.newBean;

import org.springframework.stereotype.Component;

@Component //computer beanin  elave eledi containere
public class Computer {
    public String brand;

    public Computer() {
        this.brand = "HP";
    }
    public Computer(String brand) {
        this.brand = brand;
    }
}
