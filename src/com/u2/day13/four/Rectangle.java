package com.u2.day13.four;

public class Rectangle extends Shape{
    private double length;
    private double wide;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.wide+this.length);
    }

    @Override
    public double getArea() {
        return this.length*this.wide;
    }
}
