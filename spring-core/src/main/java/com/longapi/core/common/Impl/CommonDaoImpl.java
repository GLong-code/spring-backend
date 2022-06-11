package com.longapi.core.common.Impl;

import com.longapi.core.common.CommonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class CommonDaoImpl<T, ID extends Serializable> implements CommonDao<T, ID> {

    @Autowired
    protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public List<T> queryByParam(Map map) {
        return null;
    }


    public List<T> queryByParam(Map map, String sql, Class obj ){
        return namedParameterJdbcTemplate.query(sql,map, new BeanPropertyRowMapper(obj));
    }


}
