package com.kgc.u2.day12.two;

import com.kgc.u2.day12.one.Student;

public class UserDemo {
    public static void main(String[] args) {
        Student student=new Student("xiaohua","man",23,168);
        //student.异包异类只能访问公共权限的成员
    }
}
