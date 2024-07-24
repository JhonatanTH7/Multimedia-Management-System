package com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGetAllService<RESPONSE> {
    Page<RESPONSE> getAll(Pageable pageable, String name, String stringFilter);
}