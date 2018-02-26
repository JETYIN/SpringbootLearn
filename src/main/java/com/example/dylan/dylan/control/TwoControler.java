package com.example.dylan.dylan.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/26.
 */
@RestController
@RequestMapping("/server")
public class TwoControler {

    @RequestMapping("/hello")
    public String hello() {
        return "url is /server/hello";//RequestMapping("/server")标注当前类，即当前url将加上类上的RequestMapping标注url,通常将业务相近的url放在同一controler
    }
}
