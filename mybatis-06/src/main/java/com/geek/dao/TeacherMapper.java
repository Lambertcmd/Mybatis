package com.geek.dao;

import com.geek.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName TeacherMapper
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/24 8:50
 * @Version 1.0
 **/
public interface TeacherMapper {
    @Select("select * from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);

}
