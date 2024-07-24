package com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEntityServices;

import org.springframework.stereotype.Service;

import com.Courses.MultimediaManagementSystem.api.dto.request.StudentRequest;
import com.Courses.MultimediaManagementSystem.api.dto.response.StudentResponse;
import com.Courses.MultimediaManagementSystem.api.dto.response.basic.StudentBasicResponse;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.ICreateService;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.IDisableService;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.IGetAllService;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.IGetByIdService;
import com.Courses.MultimediaManagementSystem.infrastructure.abstract_services.IEndpointsServices.IUpdateService;

@Service
public interface IStudentService extends
        IGetAllService<StudentBasicResponse>,
        IGetByIdService<StudentResponse, Long>,
        ICreateService<StudentRequest, StudentResponse>,
        IDisableService<StudentResponse, Long>,
        IUpdateService<StudentRequest, StudentResponse, Long> {

}
