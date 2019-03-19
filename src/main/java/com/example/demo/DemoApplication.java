package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;

@SpringBootApplication
//扫描mapper接口所在包
@MapperScan(basePackages = {"com.example.demo.mapper"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		UserInfo userInfo=new UserInfo();
//		System.out.println(userInfo);
	}

}
