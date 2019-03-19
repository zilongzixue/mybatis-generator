package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@RestController
public class UserController {
    @Autowired
    private  UserInfoService userInfoService;
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String UserInfo() {
        List<UserInfo> userInfoList=userInfoService.searchUserByUserName("123");
        return JSONObject.toJSONString(userInfoList);
    }

}
