package com.geek.dao;

import com.geek.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/5 8:57
 * @Version 1.0
 **/
public interface UserMapper {

    //根据ID查询用户
    User getUserById(int id);

}
