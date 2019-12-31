package com.yunhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

    @RequestMapping("course")
    public  String CourseTest(){
        return "login";
    }
}
