package com.kgc.u2.day13.eight;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle=new Car();
        vehicle.transport();

        vehicle=new Plane();
        vehicle.transport();

        vehicle=new Ship();
        vehicle.transport();
    }
}
