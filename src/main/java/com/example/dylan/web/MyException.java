package com.example.dylan.web;

/**
 * Created by Administrator on 2018/4/2.
 */
public class MyException extends Exception {//自定义异常处理机制

    public MyException(String message) {
        super(message);
    }

}