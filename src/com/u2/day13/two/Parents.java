package com.u2.day13.two;

public class Parents implements Person {
    @Override
    public void eat() {
        System.out.println("家长在招待所吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("家长在招待所睡觉");
    }
}
