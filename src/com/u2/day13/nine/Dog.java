package com.u2.day13.nine;

public class Dog extends Animal implements Bite {
    @Override
    void move() {
        System.out.println("狗正在跑");
    }

    @Override
    public void bite() {
        System.out.println("狗在咬人");
    }
}
