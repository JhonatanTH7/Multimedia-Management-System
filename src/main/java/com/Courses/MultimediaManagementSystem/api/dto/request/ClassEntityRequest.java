package com.Courses.MultimediaManagementSystem.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassEntityRequest {

    @Schema(description = "Name of the Class", example = "Meta")
    @NotBlank(message = "The Class name is required")
    private String name;

    @Schema(description = "Description of the Class", example = "Meta class where Java with springboot will be taught")
    @NotBlank(message = "The description is required")
    private String description;

    @Schema(description = "Status of the Class, it could be either true or false", example = "true")
    private Boolean isActive;

}
