package com.example.dylan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

//创建项目将自动生成此类，用以标注此类是该项目的入口类
@SpringBootApplication
@EnableScheduling//启动定时任务配置
@ComponentScan(basePackages = {"com.example.dylan"})//配置spring boot扫描整个项目包目录
public class SpringbootLearnApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringbootLearnApplication.class, args);
    }
}
