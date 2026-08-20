package com.web.project.repository;

import com.web.project.entity.CustomerEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
    @EntityGraph(attributePaths = {"orders"})
    List<CustomerEntity> findAll();

    @Query("SELECT u FROM CustomerEntity u JOIN FETCH u.orders")
    List<CustomerEntity> findAllWithOrders();
}
