package com.kgc.u3.day23.jdkproxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Book book=new Book();//目标类
        //以下构造代理对象，以接口类型接收，实现向上转型的通用性
        Sale sale1= (Sale) Proxy.newProxyInstance(book.getClass().getClassLoader(),book.getClass().getInterfaces(),new BookProxy(book));
        sale1.sale();

    }
}
