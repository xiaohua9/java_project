package com.kgc.u2.day13.two;

public class Leader implements Person {
    @Override
    public void eat() {
        System.out.println("领导没地吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("领导不许睡觉");
    }
}
