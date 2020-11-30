package com.geek.dao;

import com.geek.pojo.Student;
import com.geek.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName TeacherMapper
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/24 8:50
 * @Version 1.0
 **/
public interface TeacherMapper {
    //获取老师
    List<Teacher> getTeacher();

    //获取指定老师下的所有学生以及老师的信息
    Teacher getStudent(@Param("tid") int id);
}

