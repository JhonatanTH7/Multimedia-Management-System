package com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices;

public interface ICreateService<REQUEST, RESPONSE> {
    RESPONSE create(REQUEST request);
}