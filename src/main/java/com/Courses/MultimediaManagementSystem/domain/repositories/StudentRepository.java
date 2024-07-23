package com.Courses.MultimediaManagementSystem.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Courses.MultimediaManagementSystem.domain.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
