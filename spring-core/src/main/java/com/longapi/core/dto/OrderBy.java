package com.longapi.core.dto;

import javax.validation.constraints.NotEmpty;

public class OrderBy {

    @NotEmpty(message = "property must not null")
    private String property;

    @NotEmpty(message = "direction must not null")
    private String direction;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
