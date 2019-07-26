package com.kgc.u1.day2;
import java.util.Scanner;

//输入华氏温度，然后转换成摄氏温度
public class TemperatureChange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入华氏温度：");
        double fahrenheit=input.nextDouble();
        double celsiusTemperature=5/9.0*(fahrenheit-32);
        System.out.println("当前华氏温度为："+fahrenheit);
        System.out.println("当前摄氏温度为："+celsiusTemperature);

    }
}
