package com.library.book.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Table(name = "users")
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String password;

    @Column(nullable = false)
    private Integer enabled;

    private String name;

    private Integer type; // 1 librarian, 2 student

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleEntity> roles;
}
