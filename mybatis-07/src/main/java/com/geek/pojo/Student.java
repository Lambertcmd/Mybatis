package com.geek.pojo;

import lombok.Data;

/**
 * @ClassName student
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/24 8:47
 * @Version 1.0
 **/
@Data
public class Student {
    private int id;
    private String name;
    //学生要关联一个老师
    private int tid;
}
