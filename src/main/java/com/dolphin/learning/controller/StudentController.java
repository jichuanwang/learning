package com.dolphin.learning.controller;


import com.dolphin.learning.domain.entity.StudentEntity;
import com.dolphin.learning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Value("${age}")
    private int age;

    @RequestMapping("/student")
    public List<StudentEntity> getStudentList(){

        System.out.println("age-------"+age);
        return studentService.getStudent();
    }
}
