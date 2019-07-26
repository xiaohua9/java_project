package com.kgc.u2.day13.nine;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.move();
        ((Dog) animal).bite();

        animal=new Fish();
        animal.move();
        ((Fish) animal).spit();
    }
}
