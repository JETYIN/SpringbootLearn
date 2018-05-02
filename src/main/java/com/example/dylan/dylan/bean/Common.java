package com.example.dylan.dylan.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Administrator on 2018/3/22.
 */
public class Common {
    //声明使用application.properties中的自定义属性值
    @Value("${com.dylan.properties}")
    private String name;
    @Value("${com,dylan.properties.age}")
    private int age;
}
