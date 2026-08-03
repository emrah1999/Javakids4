package com.web.project.response;

import lombok.Data;

@Data
public class AnimalEntityResponseDTO {
    private Long id;

    private String name;

    private String color;

    private Double speed;

    private Integer age;
}
