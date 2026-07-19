package com.spring.elave.controller;

import com.spring.elave.model.User;
import com.spring.elave.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserRestController {
    private final UserService userService;
    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);

    }
    @GetMapping("/search/name")
    public List<User> searchForName(@RequestParam String name,
                                    @RequestParam(required = false) String email){
        return userService.searchForName(name,email);

    }
}
