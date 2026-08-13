package com.web.project.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "profiles")
@Data
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private Long age;

    @OneToOne
    @JoinColumn(name = "customer_id")
    @JsonBackReference
    private CustomerEntity customer;


}
