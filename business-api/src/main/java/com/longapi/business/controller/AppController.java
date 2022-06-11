package com.longapi.business.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@CrossOrigin(origins = "*")
@RestController
public class AppController {

    @RequestMapping("/")
    public String welcome(Map<String,Object> model){
        return "Hello World";
    }

}
