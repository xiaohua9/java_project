package com.u3.day23.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//代理类必须实现InvacationHandler接口
public class BookProxy implements InvocationHandler {
    private Object object;//其实可以定义成book，但是为了通用，比如再加一个卖电脑，这个代里类都不用改动
    public BookProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result=method.invoke(object,args);//目标类和拦截到的方法的参数
        System.out.println("after");
        return result;//被代理方法的返回值
    }
}
