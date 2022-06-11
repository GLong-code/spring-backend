package com.longapi.business.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)     //
public class MessageResponse<T> {
    public interface RESPONSE_STATUS{
        String SUCCESS = "SUCCESS";
        String ERROR = "ERROR";
    }

    public interface ERROR_CODE{
        String SUCCESS = "200";
        String SYSTEM_ERROR = "500";
    }

    private String code;
    private String[] paramCode;
    private String message;
    private String status;
    private T data;

    public MessageResponse() {
        this.code = ERROR_CODE.SYSTEM_ERROR;
        this.status = RESPONSE_STATUS.SUCCESS;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String[] getParamCode() {
        return paramCode;
    }

    public void setParamCode(String[] paramCode) {
        this.paramCode = paramCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MessageResponse<T> error(Exception e){
        this.setCode(ERROR_CODE.SYSTEM_ERROR);
        this.setStatus(RESPONSE_STATUS.ERROR);
        this.setMessage(e.toString());
        return this;
    }

}
