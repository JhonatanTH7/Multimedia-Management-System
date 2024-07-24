package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import com.Courses.MultimediaManagementSystem.api.dto.request.ClassEntityRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.ClassEntityBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-23T21:11:09-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ClassEntityMapperImpl implements ClassEntityMapper {

    @Override
    public ClassEntityBasicResponse toEntityResponse(ClassEntity classEntity) {
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

    @Override
    public ClassEntity toEntity(ClassEntityRequest classEntityRequest) {
        if ( classEntityRequest == null ) {
            return null;
        }

        ClassEntity classEntity = new ClassEntity();

        classEntity.setDescription( classEntityRequest.getDescription() );
        classEntity.setIsActive( classEntityRequest.getIsActive() );
        classEntity.setName( classEntityRequest.getName() );

        return classEntity;
    }
}
