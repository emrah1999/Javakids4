package com.elave3.spring.controller;

import com.elave3.spring.entity.UserEntity;
import com.elave3.spring.exception.MyValidationException;
import com.elave3.spring.request.UserAddRequestDTO;
import com.elave3.spring.request.UserUpdateRequestDTO;
import com.elave3.spring.response.UserResponse;
import com.elave3.spring.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserRestController {
    private final UserService userService;

    @PostMapping
    @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
    public void createUser(@RequestBody @Valid  UserAddRequestDTO request, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            throw new MyValidationException("Melumatlar tam deyil","Validation error",bindingResult);
        }
        userService.addUser(request);
    }

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    @PutMapping("/{id}")
    @ResponseStatus(org.springframework.http.HttpStatus.OK)
    public void update(@Valid @RequestBody UserUpdateRequestDTO request,BindingResult bindingResult,@PathVariable Long id){
        if(bindingResult.hasErrors()){
            throw new MyValidationException("Melumatlar tam deyil","Validation error",bindingResult);
        }
//        userService.updateUser(request,id);
    }
}
