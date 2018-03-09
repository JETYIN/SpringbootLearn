package com.example.dylan.dylan.service.impl;

import com.example.dylan.dylan.bean.Student;
import com.example.dylan.dylan.dao.IStudentDao;
import com.example.dylan.dylan.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/2/26.
 */
@Service//注解业务逻辑层
public class StudentServiceImpl implements IStudentService {
    //保持dao层引用，获取数据

    @Autowired
    public IStudentDao studentDao;


    @Override
    public int insert(String userId, String userName) {
        return studentDao.insert(userId, userName);
    }


    @Override
    public List<Student> getAllStudent() {
        return studentDao.getStudent();
    }

    @Override
    public List<Student> getStudentByName(String username) {

        return studentDao.getStudentByUsername(username);
    }

}
