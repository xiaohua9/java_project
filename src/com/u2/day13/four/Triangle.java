package com.u2.day13.four;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public double getArea() {//利用海伦公式
        double p=(this.side1+this.side2+this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-side3));
    }
}
