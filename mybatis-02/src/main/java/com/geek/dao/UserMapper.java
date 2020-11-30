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

    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //插入一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
