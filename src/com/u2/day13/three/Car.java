package com.u2.day13.three;

public class Car implements CommonCalc {
    private String name="小汽车";
    @Override
    public double runTime(double a, double b, double c) {
        return a*b/c;
    }
    public String getName() {
        return name;
    }
}
