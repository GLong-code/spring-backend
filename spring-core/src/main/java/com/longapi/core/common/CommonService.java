package com.longapi.core.common;

import javax.persistence.Id;
import java.util.List;
import java.util.Map;

public interface CommonService<T,ID> {

    T findById(ID id);

    List<T> findAll();

    T insert(T object);

    List<T> insert(List<T> list) throws Exception;

    void delete(ID id);

    void delete(List<T> listID);

    boolean isExistById(ID id);

    List<T> queryByParam(Map map);

}
