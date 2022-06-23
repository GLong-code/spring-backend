package com.longapi.business.service;

import com.longapi.business.entity.Student;
import com.longapi.core.common.CommonService;

import java.util.List;
import java.util.Map;

public interface StudentService extends CommonService<Student, Integer> {
    List<Student> findByName(Map map);

    List<Student> findStudentByClass(Map map);

}
