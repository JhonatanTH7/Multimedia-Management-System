package com.Courses.MultimediaManagementSystem.api.dto.response;

import java.util.List;

import com.Courses.MultimediaManagementSystem.api.dto.response.basic.ClassEntityBasicResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.LessonBasicResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.MultimediaBasicResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LessonResponse extends LessonBasicResponse {

    private ClassEntityBasicResponse classEntity;
    private List<MultimediaBasicResponse> multimedias;

}
