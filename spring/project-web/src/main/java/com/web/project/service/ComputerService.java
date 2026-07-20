package com.web.project.service;

import com.web.project.entity.ComputersEntity;
import com.web.project.repository.ComputerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComputerService {
    private final ComputerRepository computerRepository;
    public void create(ComputersEntity entity)
    {
        computerRepository.save(entity);

    }


    public List<ComputersEntity> getAll(){
        return computerRepository.findAll();
    }

    public void update(Long id, ComputersEntity request){
//        ComputersEntity existingComputer=computerRepository.findById(id).
//                orElseThrow(()->new RuntimeException("Computer not found with id: "+id));

        Optional<ComputersEntity> existingComputerOptional=computerRepository.findById(id);
        if(existingComputerOptional.isPresent()){
           ComputersEntity existingComputer=existingComputerOptional.get();
           existingComputer.setPrice(request.getPrice());
           existingComputer.setQuantity(request.getQuantity());
           existingComputer.setBrand(request.getBrand());
              existingComputer.setModel(request.getModel());
              existingComputer.setBarcode(request.getBarcode());
              computerRepository.save(existingComputer);
              Long say=computerRepository.count();

        }else{
            throw new RuntimeException("Computer not found with id: "+id);
        }
    }

    public ComputersEntity getById(Long id){
        Optional<ComputersEntity> existingComputerOptional=computerRepository.findById(id);
        if (existingComputerOptional.isPresent()){
            return existingComputerOptional.get();
        }else{
            throw new RuntimeException("Computer not found with id: "+id);
        }

    }

    public void delete(Long id){
        Optional<ComputersEntity> existingComputerOptional=computerRepository.findById(id);
        if(existingComputerOptional.isPresent()){
            computerRepository.deleteById(id);
        }else{
            throw new RuntimeException("Computer not found with id: "+id);
        }
    }
}
