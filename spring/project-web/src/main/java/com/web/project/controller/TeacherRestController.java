package com.web.project.controller;

import com.web.project.entity.TeacherEntity;
import com.web.project.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
