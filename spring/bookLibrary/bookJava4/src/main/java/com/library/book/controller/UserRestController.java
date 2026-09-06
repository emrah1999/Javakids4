package com.library.book.controller;

import com.library.book.exception.MyValidationException;
import com.library.book.request.RequestUserAddDTO;
import com.library.book.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {
    private final UserService userService;

    @PostMapping
    @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
    public void addUser(@RequestBody @Valid RequestUserAddDTO request, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new MyValidationException("Melumat tam deyil","Validaton xeta",bindingResult);
        }
        userService.addUser(request);
    }
}
