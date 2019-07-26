package com.kgc.u3.day24.task1;

public class MyRunnable implements Runnable{
    private int number=100;
    @Override
    public  void run() {
        int time=number;//有几张票就循环几次，但是这句代码非常必要，不可直接用number
        for (int i=0;i<time;i++) {//每一个线程都有number个机会
                while (number>0) {//判断是否还有票（有票不一定抢到）
                 synchronized (this){
                     if (number>0) {
                         System.out.println(Thread.currentThread().getName()+"抢到票"+"，还剩"+(number-1)+"张票");
                         number--;
                     }
                }
                    try {
                        Thread.sleep(100);//让出cpu资源
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        }
    }
}
