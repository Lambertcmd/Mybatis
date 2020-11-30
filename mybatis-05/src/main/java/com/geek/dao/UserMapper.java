package com.geek.dao;

import com.geek.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/16 15:57
 * @Version 1.0
 **/
public interface UserMapper {
    @Select("select * from user")
    List<User> getUserList();

    //方法存在多个参数，所有的参数前面必须加上@Param("id")
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name = #{name},pwd = #{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);
}
