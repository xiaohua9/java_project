package com.kgc.u3.day22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyReflect {
    public static void main(String[] args) throws Exception{
        Class cls=Class.forName("com.kgc.u3.day21.myserilazable.User");
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field:declaredFields){
            System.out.println(field.getName()+","+field.getType());
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method:declaredMethods){
            System.out.println(method.getName());
        }
        //-----------------------------------------------------
        cls=Class.forName("com.kgc.u3.day22.aa");
        Constructor constructor = cls.getConstructor();
        Object myAdd = constructor.newInstance();
        Field[] myAddFields = cls.getDeclaredFields();
        myAddFields[0].setAccessible(true);
        myAddFields[1].setAccessible(true);
        myAddFields[0].set(myAdd,10);
        myAddFields[1].set(myAdd,20);
        Method add = cls.getDeclaredMethod("add", int.class, int.class);
        add.setAccessible(true);
        System.out.println(add.invoke(myAdd, myAddFields[0].get(myAdd), myAddFields[1].get(myAdd)));
    }
}
