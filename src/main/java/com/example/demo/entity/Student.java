package com.example.demo.entity;

public class Student {
    private int stu_id;
    private String stu_name;
    private int stu_age;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu_age() {
        return stu_age;
    }

    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stu_id +
                ", stuName='" + stu_name + "'" +
                ", stuAge=" + stu_age +
                "}";
    }
}
