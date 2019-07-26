package com.kgc.u3.day18.one;

public class Test {

    public static void main(String[] args) {
        MyRunnableImp myRunnableImp=new MyRunnableImp();

        Thread th1=new Thread(myRunnableImp,"a");
        Thread th2=new Thread( myRunnableImp,"b");
        th1.start();
        th2.start();
    }
}
