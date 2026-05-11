package com.book.spring_project.DI;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {

    private final Client client;

    private final School school;

    private final Address address;

    public ConstructorInjection(Client client, School school, Address address) {
        this.client = client;
        this.school = school;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Client Name: " + client.name);
        System.out.println("School Name: " + school.name);
        System.out.println("Address: " + address.name);
    }
}
