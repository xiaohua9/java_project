package com.u2.day12.person;
//访问权限实验
public class Person {
    public int public_;
    protected int protected_;
    int defualt_;
    private int private_;

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.public_);//在同一类，不管是什么权限都可以访问
    }
}
