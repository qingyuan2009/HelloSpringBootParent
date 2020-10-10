package com.rui.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rui.web.model.Student;
import com.rui.web.service.StudentDBService;

@Controller
public class Exe_004_jdbc {
    
    @Autowired
    private StudentDBService studentDBService;
    
    @RequestMapping("/jdbc")  
    @ResponseBody
    public String saveStudent() {
        Student student = new Student(356, 766, 888, "LI", "Wuhan", 66);        
        studentDBService.saveStudent(student);
        return "student saved";
    }

}
