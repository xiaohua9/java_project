package com.u2.day12.test;

import com.u2.day12.person.Person;

public class Student extends Person {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println("student.");//外包子类可访问公共和保护
    }
}
