package com.u2.day13.three;

public class Plane implements CommonCalc {
    private String name="飞机";
    @Override
    public double runTime(double a, double b, double c) {
        return a+b+c;
    }

    public String getName() {
        return name;
    }
}
