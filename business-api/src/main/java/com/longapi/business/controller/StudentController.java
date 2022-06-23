package com.longapi.business.controller;

import com.longapi.business.dto.MessageResponse;
import com.longapi.business.entity.Student;
import com.longapi.business.service.StudentService;
import com.longapi.core.annotation.ApiRequestMapping;
import com.longapi.core.common.controller.CommonController;
import com.longapi.core.config.CoreConstants;
import com.longapi.core.utils.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

//import org.springframework.security.access.prepost.PreAuthorize;


@RequestMapping("/Student")
@RestController
@ApiRequestMapping(module = "Student")
public class StudentController extends CommonController<Student, Integer> {

    @Autowired
    StudentService studentService;

//    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    @RequestMapping(value = { "/findByName" }, method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<?> findByName(@RequestBody Map map){
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "findByName", startTime);
        MessageResponse msg = new MessageResponse();

        try
        {
            msg.setData(studentService.findByName(map));
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage(), ex);
            throw ex;
        }
        finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "findByName", startTime);
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @RequestMapping(value = {"/findStudentByClass"}, method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<?> findStudentByClass(@RequestBody Map map){
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "findStudentByClass", startTime);
        MessageResponse msg = new MessageResponse();

        try {
            msg.setData(studentService.findStudentByClass(map));
        }
        catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            throw ex;
        }
        finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "findStudentByClass", startTime);
        }
        return new ResponseEntity<>(msg,HttpStatus.OK);
    }

}
