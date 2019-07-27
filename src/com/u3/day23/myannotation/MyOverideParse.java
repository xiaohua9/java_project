package com.u3.day23.myannotation;

import java.lang.reflect.Method;

public class MyOverideParse {
    public static void main(String[] args) throws Exception{
     Class studentClass=Class.forName("com.kgc.u3.day23.myannotation.Student");
        Method[] studentMethods = studentClass.getDeclaredMethods();
        Method[] superMethods = studentClass.getSuperclass().getDeclaredMethods();
        for (Method method :studentMethods) {
            if (method.isAnnotationPresent(MyOveride.class)){//关键：判断该方法是否有括号中的注解
                for (Method method1:superMethods){
                    if (method1.getName().equals(method.getName()) && (method1.getParameterCount()==method.getParameterCount())&&method1.getModifiers()==method.getModifiers()){
                    }else {
                        throw new Exception("未完成重写");
                    }
                }
            }
        }
    }
}
