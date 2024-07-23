package com.Courses.MultimediaManagementSystem.api.dto.request;

import com.Courses.MultimediaManagementSystem.api.dto.request.update.StudentUpdateRequest;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest extends StudentUpdateRequest {

    @Schema(description = "Status of the Student, it could be either true or false", example = "true")
    private Boolean isActive;

    @Schema(description = "Id of the Class", example = "1")
    @NotNull(message = "The id of the Class is required")
    @Min(value = 1, message = "The id of the Class must be greater than zero")
    private Long classEntityId;

}
