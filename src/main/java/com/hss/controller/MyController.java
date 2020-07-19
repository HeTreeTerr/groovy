package com.hss.controller;

import com.hss.dao.MyDao;
import com.hss.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class MyController {

    @Autowired
    private MyDao myDao;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return myDao.findAll();
    }

    @RequestMapping(value = "/user")
    @ResponseBody
    public User user(){
//        User user = new User("hss","18626444426","11111111",new Date());
        User user = new User();
        user.setUsername("hss");
        user.setMobile("18626444426");
        user.setPassword("11111111");
        user.setBirthday(new Date());
        return user;
    }

    @RequestMapping(value = "/resultUser")
    @ResponseBody
    public Map<String,Object> resultUser(){
//        User user = new User("hss","18626444426","11111111",new Date());
        Map<String,Object> resultMap = new LinkedHashMap<String, Object>();
        User user = new User();
        user.setUsername("hss");
        user.setMobile("18626444426");
        user.setPassword("11111111");
        user.setBirthday(new Date());
        resultMap.put("user",user);
        return resultMap;
    }
}
