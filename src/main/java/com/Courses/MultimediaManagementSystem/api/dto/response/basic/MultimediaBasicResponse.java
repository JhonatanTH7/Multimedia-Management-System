package com.Courses.MultimediaManagementSystem.api.dto.response.basic;

import java.time.LocalDateTime;

import com.Courses.MultimediaManagementSystem.util.enums.MultimediaType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MultimediaBasicResponse {

    private Long id;
    private MultimediaType type;
    private String url;
    private LocalDateTime createdAt;

}
