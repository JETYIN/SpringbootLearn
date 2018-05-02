package com.example.dylan.dylan.control;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/2/24.
 */
@RestController
@RequestMapping(value="helloCon")
public class HelloControler {
    //为设置为提供RESRful api文档的设置
    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping("/hello")
    public String hello() throws Exception {//此处会默认返回spring的异常，返回到默认界面,但不够友好的界面
        throw new Exception("errorpage");
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    //设置支持get提交
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String get() {
        return "method get";
    }

    //配置支持swagger文档显示内容，接口说明文档
    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    //设置支持post
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String post() {
        return "methdo post";
    }

    //针对url中的变量的处理,如localhost:8080/user/user1(或是user2)
    @RequestMapping("/user/{username}")
    public String userProfile(@PathVariable("username") String username) {
        return String.format("user %s", username);
    }

    //进行多个赋值操作，处理url请求中附带的参数
    @RequestMapping("user/{username}/id/{userId}")
    public String userProfilr1(@PathVariable("username") String username, @PathVariable int userId) {
        return "";
    }

    //使用正则表达式匹配url，如无法匹配，sparing框架将会返回404
    @RequestMapping("user/{username:[a-z0-9]+}")
    public String userProfilr2() {
        return "";
    }

    /**
     * -----------------------------
     **/
    //说明:当url中请求参数/blogs?id=1时，spring将会将请求参数id=1绑定到blogId，我们需在方法中计算并返回对应值
    @RequestMapping("/blogs")
    public String bindId(@RequestParam("id") int blogId) {

//提取url中附带的请求参数blogId进行对应的逻辑处理
        return "";
    }

    //针对url如果不带有请求参数，那么会报错，此处可以通过设置required=false来解决
    @RequestMapping("server/blogs")
    public String bindId1(@RequestParam(name = "id", required = false, defaultValue = "0") int blogId) {
        return "";
    }


    //实现博客分页的实现,通过@RequestParam附带的请求参数实现http://localhost:8080/blogs?page=1

    @RequestMapping("server/page")

    public List getlist(@RequestParam(name = "page", required = false, defaultValue = "1") int page) {

        //service层返回查询到的数据
        return null;

    }
}
