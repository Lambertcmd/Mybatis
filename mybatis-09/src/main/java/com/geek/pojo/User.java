package com.geek.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/25 20:13
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
}
