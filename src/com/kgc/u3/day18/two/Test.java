package com.kgc.u3.day18.two;

public class Test {
    public static void main(String[] args) {
        Movie movie=new Movie();
        Thread thread1=new Thread(new Producter(movie),"生产者");
        Thread thread2=new Thread(new Consumer(movie),"消费者");
        thread1.start();
        thread2.start();
    }
}
