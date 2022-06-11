package com.longapi.core.utils;

import com.longapi.core.dto.OrderBy;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortUtil {

    public static List<Sort.Order> orders(List<OrderBy> orderByList){
        if (orderByList.isEmpty() || orderByList == null){
            return new ArrayList<Sort.Order>();
        }
        return orderByList.stream().map((x) -> {
            return new Sort.Order(Sort.Direction.fromString(x.getDirection()), x.getProperty());
        } ).collect(Collectors.toList());
    }

    public static Sort sort(List<OrderBy> sortOrder){
        return Sort.by(orders(sortOrder));
    }


}
