package com.hss;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestGradle {
    @Test
    public void test1(){
        System.out.println("66666");
    }

    @Test
    public void hashSet(){
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("dddd");
        stringSet.add("ffff");
        stringSet.add("dddd");
        for(String str : stringSet){
            System.out.println(str);
        }
    }
}
