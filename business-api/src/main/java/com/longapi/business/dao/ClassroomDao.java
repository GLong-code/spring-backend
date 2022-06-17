package com.longapi.business.dao;

import com.longapi.business.entity.ClassRoom;
import com.longapi.core.common.CommonDao;

import java.util.List;
import java.util.Map;

public interface ClassroomDao extends CommonDao<ClassRoom,Integer>{

    List<ClassRoom> findByName(Map map);

}
