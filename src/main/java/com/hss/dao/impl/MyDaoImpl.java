package com.hss.dao.impl;

import com.hss.dao.MyDao;
import org.springframework.stereotype.Service;

@Service
public class MyDaoImpl implements MyDao {

    @Override
    public String findAll() {
        String a1 = "hello gradle";
        System.out.println(a1);
        return a1;
    }
}
