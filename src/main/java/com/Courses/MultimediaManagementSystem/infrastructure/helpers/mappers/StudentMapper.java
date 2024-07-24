package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Courses.MultimediaManagementSystem.api.dto.request.StudentRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.StudentBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentBasicResponse toEntityResponse(Student student);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "createdAt", ignore = true),
            @Mapping(target = "classEntity.id", source = "classEntityId")
    })
    Student toEntity(StudentRequest studentRequest);

}
