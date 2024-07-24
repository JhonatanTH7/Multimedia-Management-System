package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import com.Courses.MultimediaManagementSystem.api.dto.request.LessonRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.LessonBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;
import com.Courses.MultimediaManagementSystem.domain.entities.Lesson;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-23T21:11:10-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class LessonMapperImpl implements LessonMapper {

    @Override
    public LessonBasicResponse toEntityResponse(Lesson lesson) {
        if ( lesson == null ) {
            return null;
        }

        LessonBasicResponse lessonBasicResponse = new LessonBasicResponse();

        lessonBasicResponse.setContent( lesson.getContent() );
        lessonBasicResponse.setCreatedAt( lesson.getCreatedAt() );
        lessonBasicResponse.setId( lesson.getId() );
        lessonBasicResponse.setTitle( lesson.getTitle() );

        return lessonBasicResponse;
    }

    @Override
    public Lesson toEntity(LessonRequest lessonRequest) {
        if ( lessonRequest == null ) {
            return null;
        }

        Lesson lesson = new Lesson();

        lesson.setClassEntity( lessonRequestToClassEntity( lessonRequest ) );
        lesson.setContent( lessonRequest.getContent() );
        lesson.setIsActive( lessonRequest.getIsActive() );
        lesson.setTitle( lessonRequest.getTitle() );

        return lesson;
    }

    protected ClassEntity lessonRequestToClassEntity(LessonRequest lessonRequest) {
        if ( lessonRequest == null ) {
            return null;
        }

        ClassEntity classEntity = new ClassEntity();

        classEntity.setId( lessonRequest.getClassEntityId() );

        return classEntity;
    }
}
