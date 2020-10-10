package com.rui.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rui.web.model.Student;

@Repository
public class StudentDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public void addStudent(Student student) {        
        jdbcTemplate.update("insert into examstudent (type, idcard,examcard,studentname,location,grade) "
                + "values (?,?,?,?,?,?)", new Object[] {student.getType(), student.getIdcard(), student.getExamcard(),
                        student.getStudentName(), student.getLocation(), student.getGrade()});
    }

}
