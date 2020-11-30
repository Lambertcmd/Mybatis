package com.geek.dao;

import com.geek.pojo.Student;
import com.geek.pojo.Teacher;
import com.geek.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName MapperTest
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/24 14:16
 * @Version 1.0
 **/
public class MapperTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = mapper.getTeacher();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher studentList = mapper.getStudent(1);
        System.out.println(studentList);
        sqlSession.close();
    }
}
