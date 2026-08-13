package com.web.project.controller;

import com.web.project.entity.CustomerEntity;
import com.web.project.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers")
public class CustomerRestController {
    private final CustomerService customerService;
    @GetMapping
    public List<CustomerEntity> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
