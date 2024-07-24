package com.Courses.MultimediaManagementSystem.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LessonRequest {

    @Schema(description = "Title of the Lesson", example = "Operators in Java")
    @NotBlank(message = "The title of the Lesson is required")
    private String title;
    @Schema(description = "Content of the Lesson", example = "In this Lesson we are going to learn the existing operators in Java")
    @NotBlank(message = "The content of the Lesson is required")
    private String content;
    @Schema(description = "Status of the Lesson, it could be either true or false", example = "true")
    private Boolean isActive;
    @Schema(description = "Id of the Class", example = "1")
    @NotNull(message = "The id of the Class is required")
    @Min(value = 1, message = "The id of the Class must be greater than zero")
    private Long classEntityId;

}
