package com.geek.dao;

import com.geek.pojo.Student;

import java.util.List;

/**
 * @ClassName StudentMapper
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/24 8:49
 * @Version 1.0
 **/
public interface StudentMapper {

    //查询所有的学生信息以及对应的老师的信息
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
