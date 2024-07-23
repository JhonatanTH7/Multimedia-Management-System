package com.Courses.MultimediaManagementSystem.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Courses.MultimediaManagementSystem.domain.entities.Multimedia;

public interface MultimediaRepository extends JpaRepository<Multimedia, Long> {

}
