package com.longapi.core.common.controller;


import com.longapi.core.config.CoreConstants;
import com.longapi.core.dto.MessageResponse;
import com.longapi.core.common.CommonService;
import com.longapi.core.utils.LogUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;


public class CommonController<T, ID extends Serializable> {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private CommonService<T,ID> commonService;


    public CommonService<T,ID> getService(){
        return commonService;
    }

    @SuppressWarnings("unchecked")
    public <G> G getService(Class<G> customType) {
        return (G) commonService;
    }

    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> findById(@PathVariable ID id) {
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "findById", startTime);
        MessageResponse msg = new MessageResponse();

        try {
            msg.setData(commonService.findById(id));
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "findById", startTime);
        }

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    @RequestMapping(value = "/findAll", method = RequestMethod.POST, consumes = { "application/json" })
    @ResponseBody
    public ResponseEntity<Object> findAll() throws Exception {
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "findAll", startTime);

        MessageResponse msg = new MessageResponse();

        try {
            msg.setData(commonService.findAll());
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "findAll", startTime);
        }

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Object> insert(@RequestBody @Valid T obj) {
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "insert", startTime);

        MessageResponse msg = new MessageResponse();

        try {
            T createdObject = commonService.insert(obj);
            msg.setData(createdObject);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "insert", startTime);
        }

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }


    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<Object> update(@RequestBody @Valid T obj) {
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "update", startTime);

        MessageResponse msg = new MessageResponse();

        try {
            T updatedObj = commonService.insert(obj);
            msg.setData(updatedObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "update", startTime);
        }

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }


    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> delete(@PathVariable ID id) {
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "delete", startTime);

        MessageResponse msg = new MessageResponse();

        try {
            commonService.delete(id);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "delete", startTime);
        }

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }


    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    @RequestMapping(value = "/deleteList", method = RequestMethod.POST)
    public ResponseEntity<Object> deleteList(@RequestBody List<T> list ){
        long startTime  = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "deleteList", startTime);

        MessageResponse msg = new MessageResponse();

        try {
            commonService.delete(list);
        }
        catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            throw ex;
        }
        finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "deleteList", startTime);
        }

        return new ResponseEntity<>(msg, HttpStatus.OK);

    }


}
