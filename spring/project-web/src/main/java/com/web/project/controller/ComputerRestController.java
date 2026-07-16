package com.web.project.controller;

import com.web.project.entity.ComputersEntity;
import com.web.project.service.ComputerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/computers")
public class ComputerRestController {

    private final ComputerService computerService;

    @PostMapping
    @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
    public void createComputer(@RequestBody ComputersEntity computer) {
        computerService.create(computer);
    }

    @GetMapping
    public List<ComputersEntity> getAllComputers() {
        return computerService.getAll();
    }

}
