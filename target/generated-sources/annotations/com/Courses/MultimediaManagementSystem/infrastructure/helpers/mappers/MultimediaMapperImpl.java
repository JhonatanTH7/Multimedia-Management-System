package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import com.Courses.MultimediaManagementSystem.api.dto.request.MultimediaRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.MultimediaBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.Lesson;
import com.Courses.MultimediaManagementSystem.domain.entities.Multimedia;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-23T21:11:10-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class MultimediaMapperImpl implements MultimediaMapper {

    @Override
    public MultimediaBasicResponse toEntityResponse(Multimedia multimedia) {
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

    @Override
    public Multimedia toEntity(MultimediaRequest multimediaRequest) {
        if ( multimediaRequest == null ) {
            return null;
        }

        Multimedia multimedia = new Multimedia();

        multimedia.setLesson( multimediaRequestToLesson( multimediaRequest ) );
        multimedia.setIsActive( multimediaRequest.getIsActive() );
        multimedia.setType( multimediaRequest.getType() );
        multimedia.setUrl( multimediaRequest.getUrl() );

        return multimedia;
    }

    protected Lesson multimediaRequestToLesson(MultimediaRequest multimediaRequest) {
        if ( multimediaRequest == null ) {
            return null;
        }

        Lesson lesson = new Lesson();

        lesson.setId( multimediaRequest.getLessonId() );

        return lesson;
    }
}
