package com.Courses.MultimediaManagementSystem.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Courses.MultimediaManagementSystem.api.dto.request.StudentRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.StudentResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.StudentBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.Student;
import com.Courses.MultimediaManagementSystem.domain.repositories.StudentRepository;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEntityServices.IStudentService;
import com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers.StudentMapper;
import com.Courses.MultimediaManagementSystem.util.exceptions.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    private final StudentMapper studentMapper;

    @Override
    public Page<StudentBasicResponse> getAll(Pageable pageable) {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public StudentResponse getById(Long id) {
        return this.studentMapper.toEntityResponse(this.findById(id));
    }

    @Override
    public StudentResponse create(StudentRequest request) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public StudentResponse disable(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'disable'");
    }

    @Override
    public StudentResponse update(StudentRequest request, Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    private Student findById(Long id) {
        return this.studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student with the id <" + id + "> not found"));
    }

}
