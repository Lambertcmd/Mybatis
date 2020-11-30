package com.geek.dao;

import com.geek.pojo.User;
import com.geek.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName UserDaoTest
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/9 14:43
 * @Version 1.0
 **/
public class UserDaoTest {

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }
}
