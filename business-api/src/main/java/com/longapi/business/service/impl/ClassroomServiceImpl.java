package com.longapi.business.service.impl;

import com.longapi.business.entity.ClassRoom;
import com.longapi.business.repository.ClassroomRepo;
import com.longapi.business.repository.StudentRepo;
import com.longapi.business.service.ClassroomService;
import com.longapi.core.common.Impl.CommonServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClassroomServiceImpl extends CommonServiceImpl<ClassRoom, Integer> implements ClassroomService {

    @Override
    public List<ClassRoom> findByName(Map map){
        return ((ClassroomRepo) getRepository()).findByName(map);
    }
}
