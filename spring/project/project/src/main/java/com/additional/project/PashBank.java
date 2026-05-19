package com.additional.project;

import org.springframework.stereotype.Component;

@Component
public class PashBank implements Cash{
    @Override
    public void pay() {
        System.out.println("PashBank ile odenish edildi");
    }

    @Override
    public void payWithCard() {
        System.out.println("PashBank ile kartla odenish edildi");
    }
}
