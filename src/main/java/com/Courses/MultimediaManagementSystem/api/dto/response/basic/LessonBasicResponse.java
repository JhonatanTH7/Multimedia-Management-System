package com.Courses.MultimediaManagementSystem.api.dto.response.basic;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LessonBasicResponse {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;

}
