package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Courses.MultimediaManagementSystem.api.dto.request.LessonRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.LessonResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.Lesson;

@Mapper(componentModel = "spring")
public interface LessonMapper {

    LessonResponse toEntityResponse(Lesson lesson);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "createdAt", ignore = true),
            @Mapping(target = "multimedias", ignore = true),
            @Mapping(target = "classEntity.id", source = "classEntityId")
    })
    Lesson toEntity(LessonRequest lessonRequest);

}
