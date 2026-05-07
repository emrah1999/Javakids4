package com.book.spring_project.DI;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConstructorInjection {

    private final Client client;

    private final School school;

    private final Address address;

    public void printInfo() {
        System.out.println("Client Name: " + client.name);
        System.out.println("School Name: " + school.name);
        System.out.println("Address: " + address.name);
    }
}
