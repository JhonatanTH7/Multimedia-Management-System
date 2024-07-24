package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Courses.MultimediaManagementSystem.api.dto.request.ClassEntityRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.ClassEntityBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;

@Mapper(componentModel = "spring")
public interface ClassEntityMapper {

    ClassEntityBasicResponse toEntityResponse(ClassEntity classEntity);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "createdAt", ignore = true),
            @Mapping(target = "lessons", ignore = true),
            @Mapping(target = "students", ignore = true)
    })
    ClassEntity toEntity(ClassEntityRequest classEntityRequest);

}
