package com.kgc.u2.day13.one;

public class Test {
    public static void main(String[] args) {
        Bird bird=new Dove();
        ((Dove) bird).birdLay();
        ((Dove) bird).fly();
        //其余与鸽子都是同理

    }
}
