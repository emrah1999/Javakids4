package com.web.project.response;

import lombok.Data;

import java.util.List;

@Data
public class ListAnimalResponseDTO {
    private List<AnimalEntityResponseDTO> animals;
}
