package com.additional.project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {
        private final Cash cash;

        public Order(@Qualifier("pashBank") Cash cash) {
            this.cash = cash;
        }

        public void processOrder() {
            System.out.println("Order is being processed...");
            cash.pay();
        }




}
