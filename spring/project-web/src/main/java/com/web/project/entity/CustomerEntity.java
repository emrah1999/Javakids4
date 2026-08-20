package com.web.project.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "customers")
@Data
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @OneToOne(mappedBy = "customer")
    @JsonManagedReference
    private ProfileEntity profile;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<OrderEntity> orders;
}
