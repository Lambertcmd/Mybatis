package com.geek.dao;

import com.geek.pojo.Blog;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BlogMapper
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/24 15:47
 * @Version 1.0
 **/
public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    //
    List<Blog> queryBlogChoose(Map map);

    //
    int updateBlog(Map map);

    //查询第1-2-3号记录的博客
    List<Blog> queryBlogForeach(Map map);
}
