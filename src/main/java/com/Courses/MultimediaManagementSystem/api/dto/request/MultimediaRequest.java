package com.Courses.MultimediaManagementSystem.api.dto.request;

import com.Courses.MultimediaManagementSystem.util.enums.MultimediaType;

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
public class MultimediaRequest {

    @Schema(description = "Multimedia type", example = "VIDEO")
    @NotNull(message = "Multimedia type is required, it could be either VIDEO, AUDIO, IMAGE or DOCUMENT")
    private MultimediaType type;

    @Schema(description = "url of the Multimedia", example = "https://www.example.com/page.html")
    @NotBlank(message = "The url is required")
    private String url;

    @Schema(description = "Status of the Multimedia, it could be either true or false", example = "true")
    private Boolean isActive;

    @Schema(description = "Id of the Lesson", example = "1")
    @NotNull(message = "The id of the LEsson is required")
    @Min(value = 1, message = "The id of the Lesson must be greater than zero")
    private Long lessonId;

}
