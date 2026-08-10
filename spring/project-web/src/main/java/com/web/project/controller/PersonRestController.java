package com.web.project.controller;

import com.web.project.entity.PersonEntity;
import com.web.project.response.ListAllPersonEntity;
import com.web.project.response.ListPersonEntityDTO;
import com.web.project.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.*;



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

    @GetMapping("/pagination")
    public ListAllPersonEntity findAllPagination(Pageable pageable) {
        return personService.findAllPagination(pageable);
    }

    @GetMapping("/test/page")
    public Page<PersonEntity> findPagination(Pageable pageable) {
        return personService.findPagination(pageable);
    }
    @GetMapping("/test/slice")
    public Slice<PersonEntity> findSlicePagination(Pageable pageable) {
        return personService.findSlicePagination(pageable);
    }
}
