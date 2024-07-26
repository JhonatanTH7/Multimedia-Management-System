package com.Courses.MultimediaManagementSystem.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Courses.MultimediaManagementSystem.api.dto.request.StudentRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.StudentResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.StudentBasicResponse;
import com.Courses.MultimediaManagementSystem.domain.entities.ClassEntity;
import com.Courses.MultimediaManagementSystem.domain.entities.Student;
import com.Courses.MultimediaManagementSystem.domain.repositories.ClassEntityRepository;
import com.Courses.MultimediaManagementSystem.domain.repositories.StudentRepository;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEntityServices.IStudentService;
import com.Courses.MultimediaManagementSystem.infrastructure.helpers.EmailHelper;
import com.Courses.MultimediaManagementSystem.infrastructure.helpers.mappers.StudentMapper;
import com.Courses.MultimediaManagementSystem.util.exceptions.BadRequestException;
import com.Courses.MultimediaManagementSystem.util.exceptions.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    private final ClassEntityRepository classEntityRepository;

    @Autowired
    private final StudentMapper studentMapper;

    @Autowired
    private final EmailHelper emailHelper;

    @Override
    public Page<StudentBasicResponse> getAll(Pageable pageable, String name, String email) {
        Page<Student> studentPage = studentRepository.findAll(pageable, name, email);
        return studentPage.map(studentMapper::toEntityResponse);
    }

    @Override
    public StudentResponse getById(Long id) {
        validateId(id);
        return this.studentMapper.toEntityResponse(this.find(id));
    }

    @Override
    public StudentResponse create(StudentRequest request) {
        Student student = this.studentMapper.toEntity(request);
        student.setClassEntity(this.findClassEntity(request.getClassEntityId()));
        student = this.studentRepository.save(student);
        this.emailHelper.sendEmail(student.getEmail(), student.getName(), student.getCreatedAt());
        return this.studentMapper.toEntityResponse(student);
    }

    @Override
    public StudentResponse disable(Long id) {
        validateId(id);
        Student student = this.find(id);
        student.setIsActive(false);
        return this.studentMapper.toEntityResponse(this.studentRepository.save(student));
    }

    @Override
    public StudentResponse update(StudentRequest request, Long id) {
        validateId(id);
        Student oldStudent = this.find(id);
        if (oldStudent.getClassEntity().getId() != request.getClassEntityId()) {
            oldStudent.setClassEntity(this.findClassEntity(request.getClassEntityId()));
        }
        this.studentMapper.toExistingEntity(request, oldStudent);
        return this.studentMapper.toEntityResponse(this.studentRepository.save(oldStudent));
    }

    private Student find(Long id) {
        return this.studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student with the id <" + id + "> not found"));
    }

    private ClassEntity findClassEntity(Long id) {
        return this.classEntityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Class with the id <" + id + "> not found"));
    }

    private void validateId(Long id) {
        if (id < 1) {
            throw new BadRequestException("The id must be greater than or equal to 1");
        }
    }

}
