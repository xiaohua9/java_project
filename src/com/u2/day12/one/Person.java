package com.u2.day12.one;

public abstract class Person {
    //属性：姓名，性别，年龄，身高
    public String name;
    protected String gender;
    int age;
    private double high;

    public Person() {
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person(String name, String gender, int age, double high) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.high = high;
    }
    //抽象方法
    public abstract void eat();
    //final方法
    public final void run(){
        System.out.println("run");
    }
}
