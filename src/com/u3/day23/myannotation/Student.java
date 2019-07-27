package com.u3.day23.myannotation;

public class Student extends Person{
    @MyOveride
    public void speak(){
        System.out.println("student");
    }
}
