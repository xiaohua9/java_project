package com.kgc.u3.day17.four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Worker> list=new ArrayList<Worker>();
        list.add(new Worker("zhangsan",18,3000));
        list.add(new Worker("lisi",25,3500));
        list.add(new Worker("wangwu",25,3200));
        list.add(1,new Worker("zhaoliu",24,3300));
        //删除王五的信息
        Worker worker=new Worker();
        worker.setName("wangwu");
        list.remove(list.indexOf(worker));

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Iterator<Worker> iterator=list.iterator();//获取迭代器
        while (iterator.hasNext()){
            iterator.next().work();
        }
    }
}
