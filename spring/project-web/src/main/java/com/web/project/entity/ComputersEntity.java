package com.web.project.entity;

import jakarta.persistence.*;
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

    @Column(unique = true, nullable = false)
    private String barcode;

    private Long userId; //user_id

    @Transient
    private Long userCount;

    @Lob
    private String description;

    @Enumerated(EnumType.STRING)
    private Type type;
}
