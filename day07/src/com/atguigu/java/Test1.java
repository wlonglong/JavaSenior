package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author wll
 * @create 2020-05-05 17:14
 */
public class Test1 {
    @Test
    public void test(){
        List arr = Arrays.asList(new Integer[]{123,12,125,456,678,23,435,876,987,1223});
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
