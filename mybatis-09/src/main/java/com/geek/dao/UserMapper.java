package com.geek.dao;

import com.geek.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/26 8:48
 * @Version 1.0
 **/
public interface UserMapper {
    //根据id查询用户
    List<User> queryUserById(@Param("id") int id);

    int updateUser(User user);
}
