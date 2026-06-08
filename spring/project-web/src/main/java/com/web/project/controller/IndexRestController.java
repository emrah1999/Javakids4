package com.web.project.controller;

import com.web.project.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/users")
    public List<User> users(){
        List<User> users=new ArrayList<>();
        users.add(User.builder().fullName("Teymur").password("2323").email("tey@mail.ri").build());
        users.add(User.builder().fullName("Teymur2").password("345").email("tey3@mail.ri").build());
        return users;
    }
}
