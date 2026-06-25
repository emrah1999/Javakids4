package com.web.project.controller;

import com.web.project.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    private final List<User> users=new ArrayList<>();
    public UserRestController(){
        users.add(User.builder().fullName("Teymur").password("2323").email("tey@mail.ri").build());
        users.add(User.builder().fullName("Teymur2").password("345").email("tey3@mail.ri").build());

    }
    @GetMapping
    public List<User> users(){
        return users;
    }

    @GetMapping("/{id}")
    public User user(@PathVariable Integer id){
        List<User> users=new ArrayList<>();
        users.add(User.builder().fullName("Teymur").password("2323").email("tey@mail.ri").build());
        users.add(User.builder().fullName("Teymur2").password("345").email("tey3@mail.ri").build());
        if (id > users.size()) {
            return null;
        } else {
            return users.get(id - 1);
        }
    }
    @GetMapping("/data/{name}/{surname}")
    public String metod1(@PathVariable String name,
                         @PathVariable String surname){
        return name+" "+surname;
    }

    @GetMapping("/search")
    public String search(@RequestParam String name,
                         @RequestParam String surname,
                         @RequestParam(required = false) Integer age,
                         @RequestParam(defaultValue = "0") Integer id){
        return "Search result for: "+name+" "+surname+" "+age;
    }

    @PostMapping
    public String addUser(@RequestBody User user){
        users.add(user);
        return "User added successfully";
    }
}
