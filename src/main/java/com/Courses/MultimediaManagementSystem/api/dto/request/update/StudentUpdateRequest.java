package com.Courses.MultimediaManagementSystem.api.dto.request.update;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentUpdateRequest {

    @Schema(description = "Name of the Student", example = "John Doe")
    @NotBlank(message = "The Student name is required")
    private String name;

    @Schema(description = "Email of the Student", example = "JohnDoe@Example.com")
    @NotBlank(message = "The email of the Student is required")
    @Email(message = "Enter a valid email address")
    private String email;

}
