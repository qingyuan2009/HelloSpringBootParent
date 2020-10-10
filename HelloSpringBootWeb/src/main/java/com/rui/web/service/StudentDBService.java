package com.rui.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rui.web.dao.StudentDao;
import com.rui.web.model.Student;

@Service
public class StudentDBService {
    
    @Autowired
    private StudentDao studentDao;    
       
    public void saveStudent(Student student) {
        studentDao.addStudent(student);
    }

}
