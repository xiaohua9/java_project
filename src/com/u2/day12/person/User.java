package com.u2.day12.person;

public class User {
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println("person.");//只有包权的不能访问
    }
}
