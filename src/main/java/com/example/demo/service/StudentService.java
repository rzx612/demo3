package com.example.demo.service;


import com.example.demo.entity.Student;
import com.example.demo.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired(required = false)
    public StuMapper stuMapper;

    public List<Student> findAllStudent(){
        return stuMapper.findAllStudent();
    }

    public List<Student> findStudentByStuID(int stuID){
        return stuMapper.findStudentByStudentID(stuID);
    }

}
}
