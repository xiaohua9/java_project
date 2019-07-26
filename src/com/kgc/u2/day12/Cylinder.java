package com.kgc.u2.day12;
//圆柱体类
public class Cylinder extends Circle{
    private double high;

    public double getHigh() {
        return high;
    }
    public void setHigh(double high) {
        this.high = high;
    }
   //构造方法

    public Cylinder() { }

    public Cylinder(float radius, double high) {
        super(radius);
        this.high = high;
    }
    //计算圆柱体的体积
    public double getVolume(){
        return this.getArea()*this.high;
    }

}
