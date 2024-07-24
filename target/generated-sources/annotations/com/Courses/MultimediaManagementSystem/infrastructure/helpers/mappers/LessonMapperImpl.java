package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import com.Courses.MultimediaManagementSystem.api.dto.request.LessonRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.LessonResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.ClassEntityBasicResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.MultimediaBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;
import com.Courses.MultimediaManagementSystem.domain.entities.Lesson;
import com.Courses.MultimediaManagementSystem.domain.entities.Multimedia;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-24T06:42:27-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class LessonMapperImpl implements LessonMapper {

    @Override
    public LessonResponse toEntityResponse(Lesson lesson) {
        if ( lesson == null ) {
            return null;
        }

        LessonResponse lessonResponse = new LessonResponse();

        lessonResponse.setContent( lesson.getContent() );
        lessonResponse.setCreatedAt( lesson.getCreatedAt() );
        lessonResponse.setId( lesson.getId() );
        lessonResponse.setTitle( lesson.getTitle() );
        lessonResponse.setClassEntity( classEntityToClassEntityBasicResponse( lesson.getClassEntity() ) );
        lessonResponse.setMultimedias( multimediaListToMultimediaBasicResponseList( lesson.getMultimedias() ) );

        return lessonResponse;
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

    protected MultimediaBasicResponse multimediaToMultimediaBasicResponse(Multimedia multimedia) {
        if ( multimedia == null ) {
            return null;
        }

        MultimediaBasicResponse multimediaBasicResponse = new MultimediaBasicResponse();

        multimediaBasicResponse.setCreatedAt( multimedia.getCreatedAt() );
        multimediaBasicResponse.setId( multimedia.getId() );
        multimediaBasicResponse.setType( multimedia.getType() );
        multimediaBasicResponse.setUrl( multimedia.getUrl() );

        return multimediaBasicResponse;
    }

    protected List<MultimediaBasicResponse> multimediaListToMultimediaBasicResponseList(List<Multimedia> list) {
        if ( list == null ) {
            return null;
        }

        List<MultimediaBasicResponse> list1 = new ArrayList<MultimediaBasicResponse>( list.size() );
        for ( Multimedia multimedia : list ) {
            list1.add( multimediaToMultimediaBasicResponse( multimedia ) );
        }

        return list1;
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
