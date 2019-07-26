package com.kgc.u2.day13.nine;

public class Fish extends Animal implements Spit {
    @Override
    void move() {
        System.out.println("鱼正在游动");
    }

    @Override
    public void spit() {
        System.out.println("鱼在吐泡泡");
    }
}
