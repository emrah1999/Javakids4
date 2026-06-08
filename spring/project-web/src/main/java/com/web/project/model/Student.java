package com.web.project.model;

public class Student {
    private Long id;
    private String name;
    private String surname;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Student(Long id, String name, String surname) {
        this.surname = surname;
        this.name = name;
        this.id = id;
    }
}
