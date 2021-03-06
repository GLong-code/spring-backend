package com.longapi.business.dao.impl;

import com.longapi.business.dao.StudentDao;
import com.longapi.business.entity.Student;
import com.longapi.core.common.CommonDao;
import com.longapi.core.common.Impl.CommonDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;
import java.util.Map;

public class StudentDaoImpl extends CommonDaoImpl<Student, Integer> implements StudentDao {


    @Override
    public List<Student> findByName(Map map) {
        String sql = "Select * from Student where name = :name";
        return queryByParam(map,sql,Student.class);
    }


}
