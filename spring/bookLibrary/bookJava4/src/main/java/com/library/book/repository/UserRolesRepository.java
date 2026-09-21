package com.library.book.repository;

import com.library.book.entity.AuthoritiesEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserRolesRepository extends JpaRepository<AuthoritiesEntity, Long> {
    @Modifying
    @Query(value = """
    INSERT INTO user_roles (user_id, role_id)
    SELECT ?1, id
    FROM roles where librarian = 1
    """, nativeQuery = true)
    void addLibrarianRole(Long user_id);

    @Modifying
    @Query(value = """
    INSERT INTO user_roles (user_id, role_id)
    SELECT ?1, id
    FROM roles where student = 1
    """, nativeQuery = true)
    void addStudentRole(Long user_id);
}
