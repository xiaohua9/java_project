package com.kgc.u3.day24.task2;

public class consumer implements Runnable{
    private Apple apple;

    public consumer(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void run() {
        for (int i=0;i<30;i++) {
            apple.cosumer();
        }
    }
}
