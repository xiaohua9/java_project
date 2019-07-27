package com.u2.day10later.interfacetask;

public class Command {
    public static void main(String[] args) {
        People people1=Factory.factory("老师");
        people1.speak();
    }
}
