package com.kgc.u3.day18.one;

public class MyRunnableImp implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            for (int i=0;i<10;i++) {
                System.out.println(Thread.currentThread().getName()+i);
                try {
                    Thread.yield();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
