package com.book.spring_project.praktika;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CashPayment implements PaymentProcessor{
    @Override
    public void paid() {
        System.out.println("Cash payment processed.");
    }
}
