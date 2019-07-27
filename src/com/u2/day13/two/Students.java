package com.kgc.u2.day13.two;

public class Students implements Person{
    @Override
    public void eat() {
        System.out.println("学生正在食堂吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生正在宿舍睡觉");
    }
}
