package com.u2.day13.two;

public class Teacher implements Person {
    @Override
    public void eat() {
        System.out.println("老师在教师食堂吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("老师在学校公寓睡觉");
    }
}
