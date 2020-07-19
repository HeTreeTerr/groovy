package com.hss;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDfs {

    @Test
    public void test1(){
        Integer n = 6;
        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> currList = new ArrayList<Integer>();
        dfs(resList,currList,n);

        for(List<Integer> res : resList){
            System.out.println(res);
        }
    }

    private void dfs(List<List<Integer>> resList,List<Integer> currList,int n){
        if(n == 0){
            if(currList.size() > 1){
                resList.add(new ArrayList<>(currList));
            }
            return;
        }
        for(int i = 1; i<= n; i++){
            //剪枝优化，选中的值不能小于数组最后一个值
            if(!currList.isEmpty() && currList.get(currList.size() -1) < i){
                continue;
            }
            currList.add(i);
            dfs(resList,currList,n-i);
            currList.remove(currList.size() - 1);
        }
    }
}
