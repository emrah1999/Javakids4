package com.web.project.request;


import lombok.Data;

@Data
public class AnimalAddRequestDTO {
    private String name;

    private String color;

    private Double speed;

    private Integer age;
}
