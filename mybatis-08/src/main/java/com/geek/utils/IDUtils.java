package com.geek.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @ClassName IDUtils
 * @Description TODO
 * @Author Lambert
 * @Date 2020/11/24 15:56
 * @Version 1.0
 **/
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IDUtils.getId());
    }
}
