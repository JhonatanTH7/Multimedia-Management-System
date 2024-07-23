package com.Courses.MultimediaManagementSystem.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Courses.MultimediaManagementSystem.domain.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
