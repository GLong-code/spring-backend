package com.longapi.core.common;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommonDao<T, ID extends Serializable>{
    List<T> queryByParam(Map map);
}
