package com.hss.controller;

import com.hss.domain.Menu;
import com.hss.domain.Meta;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:8090")
@RequestMapping("/system/config")
public class ConfigController {

    @RequestMapping("/menu")
    @ResponseBody
    public List<Menu> menu(){
        Meta meta = new Meta(true,false);
        Menu menu = new Menu();
        menu.setId(1L);
        menu.setPath("/home");
        menu.setComponent("Home");
        menu.setName("员工信息");
        menu.setIconCls(null);
        menu.setMeta(meta);

        Menu menu2 = new Menu();
        menu2.setId(null);
        menu2.setPath("/emp/basic");
        menu2.setComponent("EmpBasic");
        menu2.setName("基本资料");
        menu2.setIconCls(null);
        menu2.setMeta(meta);

        List<Menu> menuChildrenList = new ArrayList<Menu>();
        menuChildrenList.add(menu2);
        menu.setChildren(menuChildrenList);
        List<Menu> menuList = new ArrayList<Menu>();
        menuList.add(menu);
        return menuList;
    }
}
