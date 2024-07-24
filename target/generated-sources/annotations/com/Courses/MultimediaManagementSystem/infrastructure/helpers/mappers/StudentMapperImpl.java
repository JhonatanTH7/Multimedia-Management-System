package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import com.Courses.MultimediaManagementSystem.api.dto.request.StudentRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.StudentResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.ClassEntityBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;
import com.Courses.MultimediaManagementSystem.domain.entities.Student;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-24T06:42:27-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentResponse toEntityResponse(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentResponse studentResponse = new StudentResponse();

        studentResponse.setCreatedAt( student.getCreatedAt() );
        studentResponse.setEmail( student.getEmail() );
        studentResponse.setId( student.getId() );
        studentResponse.setName( student.getName() );
        studentResponse.setClassEntity( classEntityToClassEntityBasicResponse( student.getClassEntity() ) );

        return studentResponse;
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

    protected ClassEntityBasicResponse classEntityToClassEntityBasicResponse(ClassEntity classEntity) {
        if ( classEntity == null ) {
            return null;
        }

        ClassEntityBasicResponse classEntityBasicResponse = new ClassEntityBasicResponse();

        classEntityBasicResponse.setCreatedAt( classEntity.getCreatedAt() );
        classEntityBasicResponse.setDescription( classEntity.getDescription() );
        classEntityBasicResponse.setId( classEntity.getId() );
        classEntityBasicResponse.setName( classEntity.getName() );

        return classEntityBasicResponse;
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
