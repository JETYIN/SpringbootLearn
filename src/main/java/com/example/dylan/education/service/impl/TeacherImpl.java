package com.example.dylan.education.service.impl;

import com.example.dylan.dylan.bean.Teacher;
import com.example.dylan.education.dao.ITeacherDao;
import com.example.dylan.education.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/12.
 */
@Service
public class TeacherImpl implements ITeacherService {
    //保持dao层引用
    @Autowired
    private ITeacherDao teacherDao;//引用dao层获取的数据


    @Override
    public List<Teacher> getAllTeacher() {
        return teacherDao.getAllTeacher();
    }
}
