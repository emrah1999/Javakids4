package com.web.project.service;

import com.web.project.entity.PersonEntity;
import com.web.project.repository.PersonRepository;
import com.web.project.response.ListAllPersonEntity;
import com.web.project.response.ListPersonEntityDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
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

    public ListAllPersonEntity findAllPagination(Pageable pageable) {
       Page<PersonEntity> persons=personRepository.findAll(pageable);
       ListAllPersonEntity listAllPersonEntity=new ListAllPersonEntity();
       ArrayList<ListPersonEntityDTO> personEntity=new ArrayList<>();
        for (PersonEntity person : persons) {
            ListPersonEntityDTO peronsDto = new ListPersonEntityDTO();
            modelMapper.map(person, peronsDto);
            personEntity.add(peronsDto);

        }
        listAllPersonEntity.setPersons(personEntity);
        listAllPersonEntity.setTotalElements((int) persons.getTotalElements());
        listAllPersonEntity.setSize(persons.getSize());
        listAllPersonEntity.setTotalPages(persons.getTotalPages());
        listAllPersonEntity.setCurrentPage(persons.getNumber());
        return listAllPersonEntity;
    }

    public Page<PersonEntity> findPagination(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

    public Slice<PersonEntity> findSlicePagination(Pageable pageable) {
        Slice<PersonEntity> slice = personRepository.findAll(pageable);

        return slice;
    }

    public Page<PersonEntity> list(){
        Pageable pageable= PageRequest.of(0,10);
        return personRepository.findAll(pageable);
    }
}
