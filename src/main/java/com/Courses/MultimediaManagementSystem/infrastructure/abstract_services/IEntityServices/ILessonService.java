package com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEntityServices;

import org.springframework.stereotype.Service;

import com.Courses.MultimediaManagementSystem.api.dto.request.LessonRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.LessonResponse;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.ICreateService;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.IDisableService;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.IGetByIdService;

@Service
public interface ILessonService extends
        IGetByIdService<LessonResponse, Long>,
        ICreateService<LessonRequest, LessonResponse>,
        IDisableService<LessonResponse, Long> {

}
