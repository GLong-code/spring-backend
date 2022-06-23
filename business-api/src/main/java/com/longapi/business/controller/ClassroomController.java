package com.longapi.business.controller;

import com.longapi.business.dto.MessageResponse;
import com.longapi.business.entity.ClassRoom;
import com.longapi.business.service.ClassroomService;
import com.longapi.business.service.StudentService;
import com.longapi.core.common.controller.CommonController;
import com.longapi.core.annotation.ApiRequestMapping;

import com.longapi.core.utils.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.service.ResponseMessage;

import java.util.Map;


@RestController
@RequestMapping("/Classroom")
@ApiRequestMapping(module = "ClassRoom")
public class ClassroomController extends CommonController<ClassRoom, Integer>{

    @Autowired
    ClassroomService classroomService;

    @RequestMapping(value = "findbyname", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<?> findbyname(@RequestBody Map map){
        long startTime = System.currentTimeMillis();
        MessageResponse msg = new MessageResponse();

        try {
            msg.setData(classroomService.findByName(map));
        }

        catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            throw ex;
        }
        finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "findByName", startTime);
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}

