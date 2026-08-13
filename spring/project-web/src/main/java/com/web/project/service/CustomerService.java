package com.web.project.service;

import com.web.project.entity.CustomerEntity;
import com.web.project.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }
}
