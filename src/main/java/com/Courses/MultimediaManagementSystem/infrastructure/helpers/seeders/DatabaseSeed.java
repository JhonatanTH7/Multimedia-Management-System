package com.Courses.MultimediaManagementSystem.infrastructure.helpers.seeders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;
import com.Courses.MultimediaManagementSystem.domain.repositories.ClassEntityRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@AllArgsConstructor
@Slf4j
public class DatabaseSeed implements CommandLineRunner {

    @Autowired
    private final ClassEntityRepository classEntityRepository;

    @Override
    public void run(String... args) throws Exception {

        if (this.classEntityRepository.count() > 0) {
            log.info("Seeding Database Wasn't Executed Because there is a record already in the <Classes> table");
            return;
        }

        ClassEntity classEntity1 = new ClassEntity();
        classEntity1.setName("Class 1");
        classEntity1.setDescription("This is the first class");
        classEntity1.setIsActive(true);

        ClassEntity classEntity2 = new ClassEntity();
        classEntity2.setName("Class 2");
        classEntity2.setDescription("This is the second class");
        classEntity2.setIsActive(true);

        ClassEntity classEntity3 = new ClassEntity();
        classEntity3.setName("Class 3");
        classEntity3.setDescription("This is the third class");
        classEntity3.setIsActive(true);

        this.classEntityRepository.save(classEntity1);
        this.classEntityRepository.save(classEntity2);
        this.classEntityRepository.save(classEntity3);

        log.info("Seeding Database Executed, <Classes> added to the database");

    }

}