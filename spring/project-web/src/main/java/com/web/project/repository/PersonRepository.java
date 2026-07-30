package com.web.project.repository;

import com.web.project.entity.PersonEntity;
import com.web.project.response.ListPersonEntityDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    @Query("select p from PersonEntity p where p.email = ?1")
    List<PersonEntity> findByEmail(String email);


}
