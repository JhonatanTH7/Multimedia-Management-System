package com.Courses.MultimediaManagementSystem.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
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
public class StudentRequest {

    @Schema(description = "Name of the Student", example = "John Doe")
    @NotBlank(message = "The Student name is required")
    private String name;

    @Schema(description = "Email of the Student", example = "JohnDoe@Example.com")
    @NotBlank(message = "The email of the Student is required")
    @Email(message = "Enter a valid email address")
    private String email;

    @Schema(description = "Status of the Student, it could be either true or false", example = "true")
    private Boolean isActive = true;

    @Schema(description = "Id of the Class", example = "1")
    @NotNull(message = "The id of the Class is required")
    @Min(value = 1, message = "The id of the Class must be greater than zero")
    private Long classEntityId;

}
