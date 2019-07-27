package com.u2.day13.six;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Rabbit();
        animal.eat();
        animal.sleep();
        animal=new Tiger();
        animal.eat();
        animal.sleep();
    }
}
