package com.Courses.MultimediaManagementSystem.domain.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Courses.MultimediaManagementSystem.domain.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM student s WHERE s.name LIKE %:name% AND s.email LIKE %:email% AND s.isActive = true")
    Page<Student> findAll(Pageable pageable, @Param("name") String name, @Param("email") String email);

}
