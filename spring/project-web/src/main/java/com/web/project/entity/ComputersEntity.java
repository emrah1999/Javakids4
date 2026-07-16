package com.web.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "computers")
@Data
public class ComputersEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id; // null ola bilmez, tekralana bilmez

    private String model;

    private String brand;

    private Double price;

    private Integer quantity;
}
