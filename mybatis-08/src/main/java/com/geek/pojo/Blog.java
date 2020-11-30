package com.geek.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Blog
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/24 15:37
 * @Version 1.0
 **/
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;    //属性名和字段名不一致
    private int views;
}
