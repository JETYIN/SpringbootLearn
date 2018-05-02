package com.example.dylan.education.dao;


import com.example.dylan.dylan.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/4/12.
 */
@Mapper
public interface ITeacherDao {

    @Select("SELECT * FROM teacher")
    List<Teacher> getAllTeacher();
}
