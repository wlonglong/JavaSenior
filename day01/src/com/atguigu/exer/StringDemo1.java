package com.atguigu.exer;

import org.junit.Test;

/**
 * @author shkstart
 * @create 2019 上午 10:26
 */
public class StringDemo1 {
    /*
    获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ab”在 “abkkcadkabkebfkaabkskab” 中出现的次数

     */

    /**
     * 获取subStr在mainStr中出现的次数
     * @param mainStr
     * @param subStr
     * @return
     */
    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        //方式一：异常处理(是处理编译时异常的，不行,但是可以用手动的抛出异常)
        if(subLength == 0)
            //方式一：自定义异常类
            throw new SubException("subStr不能为空");
            //方式二：
            //throw new RuntimeException("subStr不能为空")
        //方式二：
//        if(subLength == 0)
//            return -1;
        int count = 0;
        int index = 0;
        if(mainLength >= subLength){
            //方式一：
//            while((index = mainStr.indexOf(subStr)) != -1){
//                count++;
//                mainStr = mainStr.substring(index + subStr.length());
//            }
            //方式二：对方式一的改进
            //如果mainStr和subStr都是""，出现死循环
            while((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subLength;
            }

            return count;
        }else{
            return 0;
        }
    }

    @Test
    public void testGetCount(){
        String mainStr = "abkkcadkabkebfkaabkskab";
        String subStr = "";
        int count = 0;
        count = getCount(mainStr, subStr);
//        try {
//            count = getCount(mainStr, subStr);
//        } catch (SubException e) {
//            e.printStackTrace();
//        }
        System.out.println(count);
    }


}
