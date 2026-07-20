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

    @PutMapping("/{id}")
    public void updateComputer(@PathVariable Long id,@RequestBody ComputersEntity computersEntity){
        computerService.update(id,computersEntity);
    }

    @GetMapping("/{id}")
    public ComputersEntity getComputerById(@PathVariable Long id){
        return computerService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteComputer(@PathVariable Long id){
        computerService.delete(id);
    }
}
