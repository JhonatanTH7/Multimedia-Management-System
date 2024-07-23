package com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices;

public interface IGetByIdService<RESPONSE, TYPE> {
    RESPONSE getById(TYPE id);
}