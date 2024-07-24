package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import com.Courses.MultimediaManagementSystem.api.dto.request.StudentRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.StudentBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;
import com.Courses.MultimediaManagementSystem.domain.entities.Student;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-23T21:13:14-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentBasicResponse toEntityResponse(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentBasicResponse studentBasicResponse = new StudentBasicResponse();

        studentBasicResponse.setCreatedAt( student.getCreatedAt() );
        studentBasicResponse.setEmail( student.getEmail() );
        studentBasicResponse.setId( student.getId() );
        studentBasicResponse.setName( student.getName() );

        return studentBasicResponse;
    }

    @Override
    public Student toEntity(StudentRequest studentRequest) {
        if ( studentRequest == null ) {
            return null;
        }

        Student student = new Student();

        student.setClassEntity( studentRequestToClassEntity( studentRequest ) );
        student.setEmail( studentRequest.getEmail() );
        student.setIsActive( studentRequest.getIsActive() );
        student.setName( studentRequest.getName() );

        return student;
    }

    protected ClassEntity studentRequestToClassEntity(StudentRequest studentRequest) {
        if ( studentRequest == null ) {
            return null;
        }

        ClassEntity classEntity = new ClassEntity();

        classEntity.setId( studentRequest.getClassEntityId() );

        return classEntity;
    }
}
