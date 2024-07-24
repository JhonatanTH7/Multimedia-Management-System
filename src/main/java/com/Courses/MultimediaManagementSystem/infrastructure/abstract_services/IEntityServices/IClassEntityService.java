package com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEntityServices;

import org.springframework.stereotype.Service;

import com.Courses.MultimediaManagementSystem.api.dto.request.ClassEntityRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.ClassEntityResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.ClassEntityBasicResponse;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.ICreateService;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.IGetAllService;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.IGetByIdService;

@Service
public interface IClassEntityService extends
                IGetAllService<ClassEntityBasicResponse>,
                IGetByIdService<ClassEntityResponse, Long>,
                ICreateService<ClassEntityRequest, ClassEntityResponse> {

}
