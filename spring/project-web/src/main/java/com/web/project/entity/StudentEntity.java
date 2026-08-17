package com.web.project.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="students")
@Data
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;


}
