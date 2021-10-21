package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getAllStudent")
    public List<Student> findAll(){
        return studentService.findAllStudent();
    }

    @RequestMapping("/getStudentByStudentID/{stuID}")
    public List<Student> findStudentByStudentID(@PathVariable int stuID){
        return studentService.findStudentByStuID(stuID);
    }


}

