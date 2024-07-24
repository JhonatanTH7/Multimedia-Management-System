package com.Courses.MultimediaManagementSystem.api.dto.response;

import com.Courses.MultimediaManagementSystem.api.dto.response.basic.ClassEntityBasicResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.StudentBasicResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse extends StudentBasicResponse {

    private ClassEntityBasicResponse classEntity;

}
