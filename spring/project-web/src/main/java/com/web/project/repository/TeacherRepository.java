package com.web.project.repository;

import com.web.project.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity,Long> {
    @Modifying
    @Query(value = "insert into teachers(name,subject,salary) values(?1,?2,?3)",nativeQuery = true)
    void insertTeacher(String name,String subject,String salary);

}
