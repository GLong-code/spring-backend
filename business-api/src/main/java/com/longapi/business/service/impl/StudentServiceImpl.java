package com.longapi.business.service.impl;

import com.longapi.business.entity.Student;
import com.longapi.business.repository.StudentRepo;
import com.longapi.business.service.StudentService;
import com.longapi.core.common.Impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl extends CommonServiceImpl<Student, Integer> implements StudentService {

    @Override
    public List<Student> findByName(Map map) {
        return ((StudentRepo) getRepository()).findByName(map);
    }

}
