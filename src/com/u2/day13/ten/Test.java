package com.u2.day13.ten;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle =new Car();
        vehicle.drive();

        vehicle=new Plane();
        vehicle.drive();

        vehicle=new Train();
        vehicle.drive();
    }
}
