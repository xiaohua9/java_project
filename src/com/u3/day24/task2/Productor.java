package com.u3.day24.task2;

public class Productor implements Runnable {
    private Apple apple;

    public Productor(Apple apple) {
        this.apple = apple;
    }
    @Override
    public void run() {
        for (int i=0; i<30;i++) {
            apple.product();
        }
    }
}
