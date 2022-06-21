package com.atguigu.java;

import java.util.Arrays;
import java.util.List;

/**
 * @author wll
 * @create 2020-05-05 16:26
 */
public class Test {
    public static void main(String[] args) {
        Object object1 = new Object();
        System.out.println(object1);
        String[] object = new String[5];
        System.out.println(object);
        for (int i = 0; i < object.length; i++) {
            System.out.println(object[i]);
        }
    }

}
class CollectionTest{
    //没有用，只能new一个全新的class
    @org.junit.Test
    public void test(){
        List arr = Arrays.asList(new Integer[]{123,12,125,456,678,23,435,876,987,1223});
        System.out.println(arr);
    }
}
