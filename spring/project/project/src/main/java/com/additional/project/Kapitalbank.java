package com.additional.project;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Kapitalbank implements Cash {
    @Override
    public void pay() {
        System.out.println("Kapitalbank ile odenish edildi");
    }

    @Override
    public void payWithCard() {
            System.out.println("Kapitalbank ile kartla odenish edildi");
    }
}
