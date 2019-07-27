package com.u2.day12;
//圆形的类
public class Circle {
    //属性:半径
    private double radius;
    public static final double PI=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
///////两个构造方法
    public Circle() { }
    public Circle(float radius) {
        this.radius = radius;
    }
    //计算周长
    public double getPerimeter(){
        return 2*radius*PI;
    }
    //计算面积
    public double getArea(){
        return PI*radius*radius;
    }
    //显示半径，周长，面积
    public void showInfo(){
        System.out.println("半径："+this.radius+"\t"+"圆周长："+getPerimeter()+"\t"+"圆面积："+getArea());
    }
}
