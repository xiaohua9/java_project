package com.kgc.u2.day13.four;

public class Test {
    public static void main(String[] args) {
        Shape shape=new Triangle();
        ((Triangle) shape).setSide1(3);
        ((Triangle) shape).setSide2(4);
        ((Triangle) shape).setSide3(5);
        System.out.println(shape.getPerimeter());//周长
        System.out.println(shape.getArea());//面积
    }
}
