package com.example.dylan.dylan.control;

import com.example.dylan.dylan.bean.Response;
import com.example.dylan.dylan.bean.Student;
import com.example.dylan.dylan.service.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static javafx.scene.input.KeyCode.R;

/**
 * Created by Administrator on 2018/2/26.
 */
@RestController//注解返回类型为json
@RequestMapping("student/")//当前为此类的公共接口
public class StudentAction {

    //此为spring boot的日志系统，会在控制台打印以及生成日志文件
    private final Logger log = LoggerFactory.getLogger(StudentAction.class);
    //此中保持StudentService的引用

    @Autowired//注册逻辑层,从ioc容器中去查找IStudentService
    private IStudentService studentService;


    //增加新的对外访问接口,附带在url中的字段将会赋值到对应的key,请求url示例：http://localhost:8080/student/add?username=yin&password=000000将插入对应的url附带参数
    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam(name = "username", required = false) String username, @RequestParam(name = "password", required = false) String password) {
        studentService.insert(username, password);
        return "[" + "code" + ":" + "100" + "," + "response" + ":" + "{" + "message" + ":" + "success" + "}" + "]";
    }

    @RequestMapping("/user")//此处将会直接返回{"username":"dylan","password":"111111"}
    @ResponseBody
    public Student getStudent() {
        Student student = new Student();
        student.setUsername("dylan");
        student.setPassword("111111");
        return student;
    }

    /**
     * 根据username查询数据
     *
     * @return
     */
    @RequestMapping(value = "/select/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Response> getSelectStudent() {

        Response r = new Response();
        try {
            List<Student> users = studentService.getAllStudent();
            r.setResult(users);
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);

    }

    /**
     * 按username查询,返回数据类型需要使用ResopnseEntity进行包装
     */
    @RequestMapping(value = "/select/{username}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Response> getSelectStudentByUsername(@PathVariable(value = "username") String username) {

        Response response = new Response();//创建自己新建的返回实体类
        try {

            List<Student> userList = studentService.getStudentByName(username);//取得数据源
            response.setResult(userList);//包装返回实体
            response.setStatus("ok");//包装返回实体
        } catch (Exception e) {
            response.setStatus("error'");
            response.setResult(e.getClass().getName() + ":" + e.getMessage());
        }
        return ResponseEntity.ok(response);//返回数据
    }

    @RequestMapping(value = "/docker", method = RequestMethod.GET)
    @ResponseBody
    public String testDocker() {

        return "hello docker";
    }
}
