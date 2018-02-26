package com.example.dylan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//创建项目将自动生成此类，用以标注此类是该项目的入口类
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.dylan"})//配置spring boot扫描整个项目包目录
public class SpringbootLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearnApplication.class, args);
	}
}
