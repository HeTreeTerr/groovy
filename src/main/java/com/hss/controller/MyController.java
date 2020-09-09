package com.hss.controller;

import com.hss.dao.MyDao;
import com.hss.domain.User;
import com.hss.util.VerificationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
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

    @GetMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        VerificationCode code = new VerificationCode();
        BufferedImage image = code.getImage();
        String text = code.getText();
        HttpSession session = request.getSession(true);
        session.setAttribute("verify_code", text);
        VerificationCode.output(image,resp.getOutputStream());
    }

    @RequestMapping("/doLogin")
    @CrossOrigin(origins = "http://localhost:8090")
    @ResponseBody
    public Map<String,Object> doLogin(@RequestBody Map<String, Object> map){
        System.out.println("username"+map.get("username"));
        System.out.println("password"+map.get("password"));
        System.out.println("code"+map.get("code"));
        map.put("userface","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1599584740808&di=efc468ff17bc70f402f70cfd78d16069&imgtype=0&src=http%3A%2F%2Fpics2.baidu.com%2Ffeed%2Fbd315c6034a85edf81702f204ba7a225dc54752a.jpeg%3Ftoken%3D40ea367f6b2ef995eaa6f5faf705a7d4");
        Map<String,Object> resultMap = new LinkedHashMap<String,Object>();
        resultMap.put("obj",map);
        return resultMap;
    }

    @RequestMapping("/logout")
    @CrossOrigin(origins = "http://localhost:8090")
    @ResponseBody
    public Map<String,Object> logout(){
        Map<String,Object> map = new LinkedHashMap<String, Object>();
        map.put("flag",true);
        return map;
    }
}
