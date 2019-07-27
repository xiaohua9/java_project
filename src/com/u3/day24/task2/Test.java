package com.u3.day24.task2;


public class Test {
    public static void main(String[] args) {
        Apple apple=new Apple();
        Thread thread1=new Thread(new Productor(apple),"生产者");
        Thread thread2=new Thread(new consumer(apple),"消费者");
        thread1.start();
        thread2.start();
    }
}
