package com.web.project.service;

import com.web.project.entity.ComputersEntity;
import com.web.project.repository.ComputerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComputerService {
    private final ComputerRepository computerRepository;
    public void create(ComputersEntity entity){
        computerRepository.save(entity);
    }
    public List<ComputersEntity> getAll(){
        return computerRepository.findAll();
    }
}
