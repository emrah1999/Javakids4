package com.web.project.service;

import com.web.project.entity.PersonEntity;
import com.web.project.entity.TeacherEntity;
import com.web.project.repository.PersonRepository;
import com.web.project.repository.TeacherRepository;
import com.web.project.request.PersonAndTeacherRequestDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository repository;

    private final PersonRepository personRepository;

    public List<TeacherEntity> getAll(){
        return repository.findAll();
    }

    @Transactional(rollbackOn = Exception.class)
    public void insert(PersonAndTeacherRequestDTO teacher){

        PersonEntity personEntity = new PersonEntity();
        personEntity.setName(teacher.getPersonName());
        personEntity.setEmail(teacher.getPersonEmail());
        personRepository.save(personEntity);
        repository.insertTeacher(
                teacher.getTeacherName(),
                teacher.getTeacherSubject(),
                teacher.getTeacherSalary()
        );
    }
}
