package com.web.project.repository;

import com.web.project.entity.ComputersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<ComputersEntity,Long> {
}
