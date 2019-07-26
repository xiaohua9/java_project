package com.kgc.u2.day12.two;

import com.kgc.u2.day12.one.Person;

public class User extends Person {
    public User() {
    }

    public User(String name, String gender, int age, double high) {
        super(name, gender, age, high);
    }

    @Override
    public String toString() {
        return this.name+this.gender;//此处是异包子类，因为身高是类权，因此在这里没有访问的权力
        //年龄是包权，所以也没有访问的权限
    }
    @Override//实现抽象父类的eat抽象方法
    public void eat() {
        System.out.println("eat");
    }
}
