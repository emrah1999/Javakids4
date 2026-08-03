package com.web.project.controller;

import com.web.project.request.AnimalAddRequestDTO;
import com.web.project.response.ListAnimalColorNameResponseDTO;
import com.web.project.response.ListAnimalResponseDTO;
import com.web.project.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/animals")
public class AnimalRestController {
    private final AnimalService animalService;

    @PostMapping
    @ResponseStatus(code = org.springframework.http.HttpStatus.CREATED)
    public void add(@RequestBody AnimalAddRequestDTO requestDTO) {
        animalService.add(requestDTO);
    }
    @GetMapping
    public ListAnimalResponseDTO listAnimal() {
        return animalService.listAnimal();
    }
    @GetMapping("/listAnimal2")
    public ListAnimalColorNameResponseDTO listAnimal2() {
        return animalService.listAnimal2();
    }
}
