package com.geek.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @ClassName User
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/3 17:20
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{
    private int id;
    private String name;
    private String pwd;
}
