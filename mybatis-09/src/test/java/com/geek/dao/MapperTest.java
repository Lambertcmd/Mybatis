package com.geek.dao;

import com.geek.pojo.User;
import com.geek.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName MappperTest
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/26 8:54
 * @Version 1.0
 **/
public class MapperTest {
    @Test
    public void queryUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> user = mapper.queryUserById(1);
        System.out.println(user);

        sqlSession.close();

        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        List<User> user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        sqlSession2.close();
    }


}
