package com.example.dylan.dylan.service;

import com.example.dylan.dylan.bean.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/2/26.
 */
public interface IStudentService {


    //整合mybatis
    int insert(String userId, String userName);

    //查询所有数据
    List<Student> getAllStudent();

    //通过name检索用户
    List<Student> getStudentByName(String usernaem);
}
