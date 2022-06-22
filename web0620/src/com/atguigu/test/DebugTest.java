package com.atguigu.test;

import java.util.HashMap;

/**
 * @author wll
 * @create 2022-06-21 15:01
 */
public class DebugTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);

    }
}
