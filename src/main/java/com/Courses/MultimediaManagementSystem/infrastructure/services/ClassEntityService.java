package com.Courses.MultimediaManagementSystem.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Courses.MultimediaManagementSystem.api.dto.request.ClassEntityRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.ClassEntityResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.ClassEntityBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;
import com.Courses.MultimediaManagementSystem.domain.repositories.ClassEntityRepository;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEntityServices.IClassEntityService;
import com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers.ClassEntityMapper;
import com.Courses.MultimediaManagementSystem.util.exceptions.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClassEntityService implements IClassEntityService {

    @Autowired
    private final ClassEntityRepository classEntityRepository;

    @Autowired
    private final ClassEntityMapper classEntityMapper;

    @Override
    public Page<ClassEntityBasicResponse> getAll(Pageable pageable) {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public ClassEntityResponse getById(Long id) {
        return this.classEntityMapper.toEntityResponse(this.findById(id));
    }

    @Override
    public ClassEntityResponse create(ClassEntityRequest request) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    private ClassEntity findById(Long id) {
        return this.classEntityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Class with the id <" + id + "> not found"));
    }

}
