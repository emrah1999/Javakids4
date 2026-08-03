package com.web.project.service;

import com.web.project.entity.AnimalEntity;
import com.web.project.repository.AnimalRepository;
import com.web.project.request.AnimalAddRequestDTO;
import com.web.project.response.AnimalEntityNameColorResponseDTO;
import com.web.project.response.AnimalEntityResponseDTO;
import com.web.project.response.ListAnimalColorNameResponseDTO;
import com.web.project.response.ListAnimalResponseDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService {
    private final AnimalRepository animalRepository;

    private final ModelMapper modelMapper;

    public void add(AnimalAddRequestDTO request){
        AnimalEntity animalEntity = new AnimalEntity();
//        animalEntity.setName(request.getName());
//        animalEntity.setColor(request.getColor());
//        animalEntity.setSpeed(request.getSpeed());
//        animalEntity.setAge(request.getAge());
        modelMapper.map(request,animalEntity);
        animalRepository.save(animalEntity);
    }

    public ListAnimalResponseDTO listAnimal(){
        ListAnimalResponseDTO responseDTO = new ListAnimalResponseDTO();
        List<AnimalEntity> animalEntities = animalRepository.findAll();
        List<AnimalEntityResponseDTO> animalEntityResponseDTOS = new ArrayList<>();
        for (AnimalEntity animalEntity : animalEntities) {
            AnimalEntityResponseDTO animalEntityResponseDTO = new AnimalEntityResponseDTO();
            modelMapper.map(animalEntity,animalEntityResponseDTO);
            animalEntityResponseDTOS.add(animalEntityResponseDTO);
        }
        responseDTO.setAnimals(animalEntityResponseDTOS);
        return responseDTO;

    }
    public ListAnimalColorNameResponseDTO listAnimal2(){
        ListAnimalColorNameResponseDTO responseDTO = new ListAnimalColorNameResponseDTO();
        List<AnimalEntity> animalEntities = animalRepository.findAll();
        List<AnimalEntityNameColorResponseDTO> animalEntityResponseDTOS = new ArrayList<>();
        for (AnimalEntity animalEntity : animalEntities) {
            AnimalEntityNameColorResponseDTO animalEntityResponseDTO = new AnimalEntityNameColorResponseDTO();
            modelMapper.map(animalEntity,animalEntityResponseDTO);
            animalEntityResponseDTOS.add(animalEntityResponseDTO);
        }
        responseDTO.setListAnimalColorNameResponseDTO(animalEntityResponseDTOS);
        return responseDTO;

    }
}
