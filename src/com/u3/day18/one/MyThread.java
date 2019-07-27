package com.u3.day18.one;

public class MyThread extends Thread{
    @Override
    public void run() {
        currentThread().setName("oooo");
        for (int i=0;i<10;i++) {
            System.out.println(currentThread().getName()+i);
        }
    }
}
