package com.example.dylan.dylan.dao;

import com.example.dylan.dylan.bean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/2/26.
 */
@Mapper
public interface IStudentDao {


    @Insert("INSERT INTO USERINFO(username, password) VALUES(#{username}, #{password})")
    int insert(@Param("username") String name, @Param("password") String password);

    @Select("SELECT * FROM USERINFO")
    List<Student> getStudent();

    @Select("SELECT * FROM USERINFO WHERE username=#{username}")
    List<Student> getStudentByUsername(String username);
}
