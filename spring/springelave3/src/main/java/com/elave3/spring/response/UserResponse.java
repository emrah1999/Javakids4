package com.elave3.spring.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserResponse {
    private String username;

    private String password;

    private LocalDate birthDate;

    private String address;

    private Integer salary;
}
