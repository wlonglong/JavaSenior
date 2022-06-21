package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author wll
 * @create 2020-05-16 10:16
 */
public class TestCopy {
//    @Test
//    public void testCopy(){
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream("爱情与友情.jpg");
//            fos = new FileOutputStream("爱情与友情1001.jpg");
//
//            int data;
//            while ((data = fis.read()) != -1) {
//                //字节数组进行修改
//                //错误的   buffer并没有修改，改的是b
//                //            for(byte b : buffer){
//                //                b = (byte) (b ^ 5);
//                //            }
//                //正确的
//
//                data = (byte) (data ^ 5);
//                fos.write(data);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }
//    }
//    @Test
//    public void testCopy1(){
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream("爱情与友情1001.jpg");
//            fos = new FileOutputStream("爱情与友情1002.jpg");
//
//            int data;
//            while ((data = fis.read()) != -1) {
//                //字节数组进行修改
//                //错误的   buffer并没有修改，改的是b
//                //            for(byte b : buffer){
//                //                b = (byte) (b ^ 5);
//                //            }
//                //正确的
//
//                data = (byte) (data ^ 5);
//                fos.write(data);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }
//    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        System.out.println(a);
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("wll",23));
        list.add(new Person("wll",24));
        list.add(new Person("wll",25));
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };
        Collections.sort(list,comparator);

    }
}
class Person{
    private String name;
    private int age;
//    Person(String name,int age){
//        this.name = name;
//        this.age = age;
//
//    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
