package com.u2.day13.five;

public abstract class People {
    private String name;
    private int age;
    //构造方法
    public People() { }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //set/get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //显示信息的方法
    public abstract  void showInfo();
}
