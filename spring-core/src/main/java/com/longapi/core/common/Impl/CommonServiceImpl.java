package com.longapi.core.common.Impl;

import com.longapi.core.common.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


@Transactional
public class CommonServiceImpl<T,ID extends Serializable> implements CommonService<T,ID> {

    @Autowired
    JpaRepository<T,ID> jpaRepository;

    public JpaRepository<T,ID> getRepository() {
        return jpaRepository;
    }


    @Override
    public T findById(ID id) {
        return jpaRepository.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public T insert(T object) {
        return jpaRepository.save(object);
    }

    @Override
    public List<T> insert(List<T> list) throws Exception {
        return jpaRepository.saveAll(list);
    }

    @Override
    public void delete(ID id) {
         jpaRepository.deleteById(id);
    }

    @Override
    public void delete(List<T> listID) {
        jpaRepository.deleteAll(listID);
    }

    @Override
    public boolean isExistById(ID id) {
        return jpaRepository.existsById(id);
    }

    @Override
    public List<T> queryByParam(Map map) {
        return null;
    }



}
