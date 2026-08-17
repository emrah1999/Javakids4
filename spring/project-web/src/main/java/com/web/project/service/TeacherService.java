package com.web.project.service;

import com.web.project.entity.TeacherEntity;
import com.web.project.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository repository;

    public List<TeacherEntity> getAll(){
        return repository.findAll();
    }
}
