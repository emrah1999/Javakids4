package com.web.project.controller;

import com.web.project.entity.PersonEntity;
import com.web.project.response.ListAllPersonEntity;
import com.web.project.response.ListPersonEntityDTO;
import com.web.project.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/persons")
public class PersonRestController {
    private final PersonService personService;
    @PostMapping
    public void add(@RequestBody PersonEntity person) {
        personService.add(person);
    }

    @GetMapping("/search")
    public ListAllPersonEntity findByEmail(@RequestParam String email) {
        return personService.findByEmail(email);
    }
}
