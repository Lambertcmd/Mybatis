package com.geek.utils;

import org.apache.ibatis.cache.Cache;

/**
 * @ClassName MyCache
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/30 9:00
 * @Version 1.0
 **/
public class MyCache implements Cache {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void putObject(Object o, Object o1) {

    }

    @Override
    public Object getObject(Object o) {
        return null;
    }

    @Override
    public Object removeObject(Object o) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }
}
