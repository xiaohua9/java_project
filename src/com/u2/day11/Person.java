package com.u2.day11;
//人类
public class Person {
    //属性：姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name+"eat fish");
    }
}
