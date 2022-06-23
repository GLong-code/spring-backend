package com.longapi.business.service;

import com.longapi.business.entity.ClassRoom;
import com.longapi.core.common.CommonService;

import java.util.List;
import java.util.Map;


public interface ClassroomService extends CommonService<ClassRoom, Integer>{

    List<ClassRoom> findByName(Map map);

}
