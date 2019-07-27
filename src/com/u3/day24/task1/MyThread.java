package com.u3.day24.task1;

public class MyThread {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1=new Thread(myRunnable,"张三");
        thread1.start();
        Thread thread2=new Thread(myRunnable,"李四");
        thread2.start();


    }
}
