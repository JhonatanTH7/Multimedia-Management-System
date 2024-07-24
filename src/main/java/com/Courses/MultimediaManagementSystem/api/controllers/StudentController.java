package com.Courses.MultimediaManagementSystem.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.Courses.MultimediaManagementSystem.api.dto.request.StudentRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.StudentResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.StudentBasicResponse;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEntityServices.IStudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Students Module", description = "Controller module where all student management will be done")
@RestController
@RequestMapping(path = "/student")
@AllArgsConstructor
public class StudentController {

    @Autowired
    private final IStudentService iStudentService;

    @Operation(summary = "Shows all Students", description = "Displays all Students that have been saved in the database")
    @GetMapping
    public ResponseEntity<Page<StudentBasicResponse>> getAll(
            @Parameter(description = "Page number of the page to review the results obtained by searching for students", example = "1") @RequestParam(defaultValue = "0") int page,
            @Parameter(description = "Page size to review the results obtained by searching for students", example = "5") @RequestParam(defaultValue = "5") int size,
            @Parameter(description = "Name to be used to filter the Students you want to search for, in case it is not sent it'll bring all the results", example = "Jhon") @RequestParam(defaultValue = "", required = false) String name,
            @Parameter(description = "Email to be used to filter the Students you want to search for, in case it is not sent it'll bring all the results", example = "Jhon@example") @RequestParam(defaultValue = "", required = false) String email) {
        Pageable pageable = PageRequest.of(page, size);
        if (page != 0)
            pageable = PageRequest.of(page - 1, size);
        return ResponseEntity.ok(this.iStudentService.getAll(pageable, name, email));
    }

    @Operation(summary = "Search for a Student", description = "Displays the Student to which the id refers to")
    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getById(
            @Parameter(description = "Id of the Student you want to search for", example = "1") @PathVariable Long id) {
        return ResponseEntity.ok(this.iStudentService.getById(id));
    }

    @Operation(summary = "Create a Student", description = "Create a Student with the sent parameters")
    @PostMapping
    public ResponseEntity<StudentResponse> create(@Validated @RequestBody StudentRequest studentRequest) {
        return ResponseEntity.ok(this.iStudentService.create(studentRequest));
    }

    @Operation(summary = "Disables a Student", description = "Disables the Student to which the id refers to")
    @PatchMapping("/{id}")
    public ResponseEntity<StudentResponse> disable(
            @Parameter(description = "Id of the Student you want to disable", example = "1") @PathVariable Long id) {
        return ResponseEntity.ok(this.iStudentService.disable(id));
    }

    @Operation(summary = "Update a Student", description = "Updates a Student with the sent parameters")
    @PutMapping(path = "/{id}")
    public ResponseEntity<StudentResponse> update(
            @Validated @RequestBody StudentRequest request,
            @Parameter(description = "Id of the Student you want to update", example = "1") @PathVariable Long id) {
        return ResponseEntity.ok(this.iStudentService.update(request, id));
    }

}
