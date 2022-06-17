package com.longapi.business.controller;

import com.longapi.business.entity.ClassRoom;
import com.longapi.core.common.controller.CommonController;
import com.longapi.core.annotation.ApiRequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Classroom")
@ApiRequestMapping(module = "ClassRoom")
public class ClassroomController extends CommonController<ClassRoom, Integer>{



}
