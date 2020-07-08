package com.hss.controller;

import com.hss.dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private MyDao myDao;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return myDao.findAll();
    }
}
