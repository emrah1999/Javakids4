package com.elave3.spring.service;


import com.elave3.spring.request.UserAddRequestDTO;
import com.elave3.spring.response.UserResponse;

public interface UserService {
    void addUser(UserAddRequestDTO request);
    UserResponse getUserById(Long id);
}
