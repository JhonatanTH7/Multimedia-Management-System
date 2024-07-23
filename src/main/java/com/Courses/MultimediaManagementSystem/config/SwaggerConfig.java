package com.Courses.MultimediaManagementSystem.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@Configuration
@OpenAPIDefinition(info = @Info(title = "MultimediaManagementSystem", version = "1.0", description = "Multimedia management system for lessons and resources of an educational institution", license = @License(name = "JTH"), contact = @Contact(name = "Jhonatan Toro Hurtado", url = "https://jhonatantoro.netlify.app/")))
public class SwaggerConfig {

}
