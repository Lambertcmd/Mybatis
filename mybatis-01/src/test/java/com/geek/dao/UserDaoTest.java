package com.geek.dao;

import com.geek.pojo.User;
import com.geek.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserDaoTest
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/13 9:33
 * @Version 1.0
 **/
public class UserDaoTest {
    @Test
    public void getUserById(){
        //获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        //关闭session对象
        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(4,"王五","159357"));
        if (res > 0){
            System.out.println("插入成功!");
        }

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId","5");
        map.put("userName","Hello");
        map.put("password","222155");

        int res = mapper.addUser2(map);
        if(res > 0){
            System.out.println("插入成功!")
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
