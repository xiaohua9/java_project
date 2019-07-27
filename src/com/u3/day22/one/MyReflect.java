package com.u3.day22.one;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
* 反射完成
1.构造两个班｛101,”java"｝{102,”bigData"}
   a.得到Classes类的构造方法
   b.使用构造方法实例化一个班级对象 c1  c2
2. 构造两个学生对象{1,"小丽",21,c1},{2,"小华",23,c2}
3.在学生中重写toString()输出学生信息，以及这个学生所在班级信息；
* */
public class MyReflect {
    public static void main(String[] args) throws Exception{
        //获取班级的类对象
        Class classesClass = Class.forName("com.u3.day22.one.Classes");
        //获取班级的构造方法
        Constructor classesConstructor = classesClass.getDeclaredConstructor();
        //用构造方法创建实例
        Classes c1 = (Classes) classesConstructor.newInstance();
        //获取班级的属性
        Field[] classesFields = classesClass.getDeclaredFields();
        //先给属性开放权限
        classesFields[0].setAccessible(true);
        classesFields[1].setAccessible(true);
        //c1班的班级编号设为101
        classesFields[0].set(c1,101);
        //c1班的班级名称设为java
        classesFields[1].set(c1,"java");
        //-------c2同理----------------------
        //用构造方法创建实例
        Classes c2 = (Classes) classesConstructor.newInstance();
        //c2班的班级编号设为101
        classesFields[0].set(c2,102);
        //c2班的班级名称设为java
        classesFields[1].set(c2,"bigData");

        //下面开始构造学生
        Class studentClass=Class.forName("com.u3.day22.one.Student");
        //获得学生的构造方法
        Constructor studentConstructor = studentClass.getDeclaredConstructor();
        //构造学生1
        Student student1 = (Student)studentConstructor.newInstance();
        //获取所有属性
        Field[] studentFields = studentClass.getDeclaredFields();
        //先开放属性权限
        studentFields[0].setAccessible(true);
        studentFields[1].setAccessible(true);
        studentFields[2].setAccessible(true);
        studentFields[3].setAccessible(true);
        //给属性赋值
        studentFields[0].set(student1,1);
        studentFields[1].set(student1,"小丽");
        studentFields[2].set(student1,21);
        studentFields[3].set(student1,c1);
        ///---创建学生2同理
        Student student2 = (Student)studentConstructor.newInstance();
        //给属性赋值
        studentFields[0].set(student2,2);
        studentFields[1].set(student2,"小华");
        studentFields[2].set(student2,23);
        studentFields[3].set(student2,c2);

        //------以上已经完成了对象的创建和赋值
        //以下就对信息进行输出
        Method toString = studentClass.getDeclaredMethod("toString");
        System.out.println(student1);
        System.out.println("-----------------------------------------------");
        System.out.println(student2);


    }
}
