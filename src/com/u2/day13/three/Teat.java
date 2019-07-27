package com.u2.day13.three;

public class Teat {
    public static void main(String[] args) {
        CommonCalc co=new Car();
        System.out.println(((Car) co).getName());
        System.out.println(co.runTime(3,4,5));
        co=new Plane();
        System.out.println(((Plane) co).getName());
        System.out.println(co.runTime(2,3,4));

    }
}
