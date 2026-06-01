package com.web.project.controller;

import com.web.project.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexRestController {
    private final  User user;

    @GetMapping
    public User user(){
        User user1=User.builder().fullName("Nihat")
                .password("1234")
                .username("nihat")
                .email("nihat@Mail.ru").build();
        return user1;
    }
}
