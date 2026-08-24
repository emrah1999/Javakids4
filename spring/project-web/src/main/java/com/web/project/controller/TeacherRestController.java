package com.web.project.controller;

import com.web.project.entity.TeacherEntity;
import com.web.project.request.PersonAndTeacherRequestDTO;
import com.web.project.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
@RequiredArgsConstructor
public class TeacherRestController {
    private final TeacherService service;

    @GetMapping
    public List<TeacherEntity> getAll(){
        return service.getAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(@RequestBody PersonAndTeacherRequestDTO teacher){
        service.insert(teacher);
    }
}
