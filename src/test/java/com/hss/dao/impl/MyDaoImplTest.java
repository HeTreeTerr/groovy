/*
package com.hss.dao.impl;

import com.hss.dao.MyDao;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class MyDaoImplTest {

    @Test
    public void findAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MyDao myDao = ac.getBean(MyDao.class);
        MyDao myDao = (MyDao)ac.getBean("myDaoImpl");
        myDao.findAll();
    }
}*/
