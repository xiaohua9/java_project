package com.kgc.u2.day15.simplefactory;

public class Test {
    public static void main(String[] args) {
        Mouse mouse=Factory.factory(2);
        mouse.print();
    }
}
