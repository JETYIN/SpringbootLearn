package com.example.dylan.education.control;

import com.example.dylan.dylan.bean.Response;
import com.example.dylan.dylan.bean.Teacher;
import com.example.dylan.education.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/4/12.
 */
@RestController
@RequestMapping("/teacher")

public class TeacherAction {

    @Autowired
    private ITeacherService teacherService;

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity showAllTeacher() {

        Response r = new Response();
        try {
            List<Teacher> users = teacherService.getAllTeacher();
            r.setResult(users);
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);

    }

}
