package com.atguigu.exer;

/**
 * @author wll
 * @create 2020-04-04 22:13
 */
public class SubException extends RuntimeException{
    static final long serialVersionUID =76237619686345L;

    public SubException(){

    }

    public SubException(String msg){
        super(msg);
    }
}
