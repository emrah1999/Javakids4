package com.web.project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="teachers")
@Data
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String  subject;

    private Double salary;

    @ManyToMany
    @JoinTable(name="students_teachers",
    joinColumns = @JoinColumn(name="teacher_id"),
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<StudentEntity> students;



}
