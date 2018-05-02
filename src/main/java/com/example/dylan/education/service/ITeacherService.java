package com.example.dylan.education.service;

import com.example.dylan.dylan.bean.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/12.
 */

public interface ITeacherService {

    List<Teacher> getAllTeacher();
}
