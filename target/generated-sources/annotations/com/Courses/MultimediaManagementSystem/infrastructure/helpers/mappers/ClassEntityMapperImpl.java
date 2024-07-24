package com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers;

import com.Courses.MultimediaManagementSystem.api.dto.request.ClassEntityRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.ClassEntityResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.LessonBasicResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.StudentBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;
import com.Courses.MultimediaManagementSystem.domain.entities.Lesson;
import com.Courses.MultimediaManagementSystem.domain.entities.Student;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-23T22:33:14-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ClassEntityMapperImpl implements ClassEntityMapper {

    @Override
    public ClassEntityResponse toEntityResponse(ClassEntity classEntity) {
        if ( classEntity == null ) {
            return null;
        }

        ClassEntityResponse classEntityResponse = new ClassEntityResponse();

        classEntityResponse.setCreatedAt( classEntity.getCreatedAt() );
        classEntityResponse.setDescription( classEntity.getDescription() );
        classEntityResponse.setId( classEntity.getId() );
        classEntityResponse.setName( classEntity.getName() );
        classEntityResponse.setLessons( lessonListToLessonBasicResponseList( classEntity.getLessons() ) );
        classEntityResponse.setStudents( studentListToStudentBasicResponseList( classEntity.getStudents() ) );

        return classEntityResponse;
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

    protected LessonBasicResponse lessonToLessonBasicResponse(Lesson lesson) {
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

    protected List<LessonBasicResponse> lessonListToLessonBasicResponseList(List<Lesson> list) {
        if ( list == null ) {
            return null;
        }

        List<LessonBasicResponse> list1 = new ArrayList<LessonBasicResponse>( list.size() );
        for ( Lesson lesson : list ) {
            list1.add( lessonToLessonBasicResponse( lesson ) );
        }

        return list1;
    }

    protected StudentBasicResponse studentToStudentBasicResponse(Student student) {
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

    protected List<StudentBasicResponse> studentListToStudentBasicResponseList(List<Student> list) {
        if ( list == null ) {
            return null;
        }

        List<StudentBasicResponse> list1 = new ArrayList<StudentBasicResponse>( list.size() );
        for ( Student student : list ) {
            list1.add( studentToStudentBasicResponse( student ) );
        }

        return list1;
    }
}
