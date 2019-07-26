package com.kgc.u3.day23.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        //通过Enhancer生成代理对象
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Book.class);
        enhancer.setCallback(new BookProxy());
        //生成实现类的代理对象[接口]
         Book book=(Book)enhancer.create();
        book.sale();
    }
}
