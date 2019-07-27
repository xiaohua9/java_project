package com.u2.day12.test;

import com.u2.day12.person.Person;

public class User {
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println("person.");//外包异类只能访问公共成员
        Student student=new Student();
        System.out.println("student.");//保护权限在外包只能在子类流动

    }

}

