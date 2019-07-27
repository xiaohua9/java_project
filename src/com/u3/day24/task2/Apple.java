package com.u3.day24.task2;

public class Apple {
    private int count;
    public synchronized void product(){//当小于20时生产，一旦生产，即可消费，唤醒消费，当大于等于20时，不生产
        if (count<20) {
            System.out.print("生产一个苹果-----");
            this.count++;
            System.out.println("当前有"+count+"个苹果");
            this.notify();
        }else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void cosumer(){//当大于0时，可消费，当小于5时，唤醒生产，没有时，不可以消费
        if (count>0) {
            System.out.print("消费一个苹果-----");
            this.count--;
            System.out.println("当前有"+count+"个苹果");
        }else {
            this.notify();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (count<5){
            this.notify();
        }
    }
}
