package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Courses.MultimediaManagementSystem.api.dto.request.MultimediaRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.MultimediaBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.Multimedia;

@Mapper(componentModel = "spring")
public interface MultimediaMapper {

    MultimediaBasicResponse toEntityResponse(Multimedia multimedia);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "createdAt", ignore = true),
            @Mapping(target = "lesson.id", source = "lessonId")
    })
    Multimedia toEntity(MultimediaRequest multimediaRequest);

}
