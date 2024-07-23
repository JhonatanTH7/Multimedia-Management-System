package com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices;

public interface IDisableService<RESPONSE, TYPE> {
    RESPONSE disable(TYPE id);
}
