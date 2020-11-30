package com.geek.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/24 8:49
 * @Version 1.0
 **/
@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生
    private List<Student> students;
}
