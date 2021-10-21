package com.example.demo.mapper;


import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {
    public List<Student> findAllStudent();
    public List<Student> findStudentByStudentID(int stuID);
}
