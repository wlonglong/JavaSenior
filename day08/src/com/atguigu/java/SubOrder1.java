package com.atguigu.java;

/**
 * @author shkstart
 * @create 2019 上午 11:18
 */
//jdk7新特性：类型推断
//public class SubOrder1<T> extends Order {//SubOrder1<T>:仍然是泛型类
//}
public class SubOrder1<T> extends Order<T> {//SubOrder1<T>:仍然是泛型类
}
