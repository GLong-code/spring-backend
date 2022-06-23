package com.longapi.business.dao;

import com.longapi.business.entity.Student;
import com.longapi.core.common.CommonDao;

import java.util.List;
import java.util.Map;

public interface StudentDao extends CommonDao<Student, Integer> {

    List<Student> findByName(Map map);

    List<Student> findStudentByClass(Map map);

}
