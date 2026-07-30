package com.web.project.service;

import com.web.project.entity.PersonEntity;
import com.web.project.repository.PersonRepository;
import com.web.project.response.ListAllPersonEntity;
import com.web.project.response.ListPersonEntityDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    public void add(PersonEntity person) {
        personRepository.save(person);
    }

    public ListAllPersonEntity findByEmail(String email) {
        List<PersonEntity> persons = personRepository.findByEmail(email);
        ListAllPersonEntity listAllPersonEntity = new ListAllPersonEntity();
        ArrayList<ListPersonEntityDTO> personEntity = new ArrayList<>();
        ;
        for (PersonEntity person : persons) {
            ListPersonEntityDTO peronsDto = new ListPersonEntityDTO();
            modelMapper.map(person, peronsDto);
            personEntity.add(peronsDto);

        }
        listAllPersonEntity.setPersons(personEntity);
        return listAllPersonEntity;
    }
}
