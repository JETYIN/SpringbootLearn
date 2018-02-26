package com.example.dylan.dylan.service.impl;

import com.example.dylan.dylan.bean.Student;
import com.example.dylan.dylan.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/2/26.
 */
@Service//注解业务逻辑层
public class StudentServiceImpl implements IStudentService {


    @Override
    public int studentNum() {
        return new Student().getNum();
    }

    @Override
    public String getStudent() {
        return new Student().getStudent();
    }
}
