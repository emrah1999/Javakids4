package com.book.spring_project.praktika;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CardPayment implements PaymentProcessor{
    @Override
    public void paid() {
        System.out.println("Card payment processed.");
    }
}
