package com.kgc.u2.day12.person;
//同包访问权限实验
public class Student extends Person{
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student.public_);//公共权限的可以
        System.out.println(student.protected_);//保护权限的可以
        System.out.println(student.defualt_);//默认权限的可以
        System.out.println("student.private_");//类权不可以
    }
}
