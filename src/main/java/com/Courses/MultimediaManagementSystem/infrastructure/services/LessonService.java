package com.Courses.MultimediaManagementSystem.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Courses.MultimediaManagementSystem.api.dto.request.LessonRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.LessonResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.Lesson;
import com.Courses.MultimediaManagementSystem.domain.repositories.LessonRepository;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEntityServices.ILessonService;
import com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers.LessonMapper;
import com.Courses.MultimediaManagementSystem.util.exceptions.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LessonService implements ILessonService {

    @Autowired
    private final LessonRepository lessonRepository;

    @Autowired
    private final LessonMapper lessonMapper;

    @Override
    public LessonResponse getById(Long id) {
        return this.lessonMapper.toEntityResponse(this.findById(id));
    }

    @Override
    public LessonResponse create(LessonRequest request) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public LessonResponse disable(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'disable'");
    }

    private Lesson findById(Long id) {
        return this.lessonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Lesson with the id <" + id + "> not found"));
    }

}
