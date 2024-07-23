package com.Courses.MultimediaManagementSystem.api.dto.response;

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
public class MultimediaResponse extends MultimediaBasicResponse {

    private LessonBasicResponse lesson;

}
