package com.longapi.business.dao.impl;

import com.longapi.business.dao.ClassroomDao;
import com.longapi.business.entity.ClassRoom;
import com.longapi.business.entity.Student;
import com.longapi.core.common.Impl.CommonDaoImpl;

import java.util.List;
import java.util.Map;

public class ClassroomDaoImpl extends CommonDaoImpl<ClassRoom, Integer> implements ClassroomDao {

    @Override
    public List<ClassRoom> findByName(Map map) {
        String sql = "Select * from classroom where name = :name";
        return queryByParam(map,sql,ClassRoom.class);
    }
}
