package com.Courses.MultimediaManagementSystem.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;

@Repository
public interface ClassEntityRepository extends JpaRepository<ClassEntity, Long> {

}
