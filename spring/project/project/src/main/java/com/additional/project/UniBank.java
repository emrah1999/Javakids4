package com.additional.project;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class UniBank implements Cash {
    @Override
    public void pay() {
        System.out.println("UniBank ile odenish edildi");
    }

    @Override
    public void payWithCard() {
        System.out.println("UniBank ile kartla odenish edildi");
    }
}
