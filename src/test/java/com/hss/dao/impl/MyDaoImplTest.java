package com.hss.dao.impl;

import com.hss.dao.MyDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MyDaoImplTest {

    @Test
    public void findAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MyDao myDao = ac.getBean(MyDao.class);
        MyDao myDao = (MyDao)ac.getBean("myDaoImpl");
        myDao.findAll();
    }
}
