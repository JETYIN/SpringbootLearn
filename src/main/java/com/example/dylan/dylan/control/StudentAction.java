package com.example.dylan.dylan.control;

import com.example.dylan.dylan.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/26.
 */
@RestController
@RequestMapping("student/")//当前为此类的公共接口
public class StudentAction {

    //此中保持StudentService的引用

    @Autowired//注册逻辑层
    private IStudentService studentService;

    @RequestMapping("num")
    @ResponseBody
    public int getStudentNum() {

        return studentService.studentNum();
    }

    @RequestMapping("data")
    @ResponseBody
    public String getStudent() {
        return studentService.getStudent();
    }
}
