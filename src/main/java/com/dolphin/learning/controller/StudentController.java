package com.dolphin.learning.controller;


import com.dolphin.learning.configproperty.MyConfig;
import com.dolphin.learning.domain.entity.StudentEntity;
import com.dolphin.learning.service.StudentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private MyConfig myConfig;

    @RequestMapping("/student")
    public List<StudentEntity> getStudentList(){
        log.info("info....");
        log.info("debug....");
        log.info("warn....");
        log.info("error....");
        System.out.println("name-------"+myConfig);
        return studentService.getStudent();
    }
}
