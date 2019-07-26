package com.kgc.u1.day2;
import java.util.Scanner;
//本程序通过圆半径的输入，求出相应的面积
public class CircleArea {
    public static void main(String[] args) {
        final double pi =3.14;
        Scanner input= new Scanner(System.in);
        System.out.println("请输入一个整数半径值：");
        int Radius=input.nextInt();
        double area =pi*Radius*Radius;
        System.out.println("This circle's area is "+'\t'+area);
    }
}
