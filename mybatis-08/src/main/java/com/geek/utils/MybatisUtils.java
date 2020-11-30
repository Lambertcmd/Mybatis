package com.geek.utils;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


/**
 * @ClassName MybatisUtils
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/3 16:24
 * @Version 1.0
 **/
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //使用Mybatis 第一步：获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取SqlSession连接
     * sqlSession完全包含了面向数据库执行SQL命令所需的所有方法
     * @return
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }
}
