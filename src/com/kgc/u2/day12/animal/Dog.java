package com.kgc.u2.day12.animal;

public class Dog extends Animal{
    @Override
    public void speak(Animal animal) {
        System.out.println("bbbb");
    }
    public void speak(Dog dog){
        System.out.println("cccc");
    }
}
