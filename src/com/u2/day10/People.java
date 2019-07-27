package com.u2.day10;
//建一个人类
import java.util.Scanner;

public class People {
    //属性，姓名，年龄，身高，性别
    private String name;
    private int age;
    private double high;
    private char gender;
    private static Scanner input=new Scanner(System.in);//定义一个私有的类扫描器
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    //说话的方法
    public void speek(){
        System.out.println("大家好！我叫"+this.name+",今年"+this.age);
    }
    //计算的方法,调用写好的计算器工具类
    public void calc(){
        Calc calc=new Calc();
        calc.calcSelect();
    }
    //改名方法
    public void changeName(){
        System.out.println("请输入你的新名字：");
        this.name=input.next();
        System.out.println("大家好！现在我叫"+this.name+",今年"+this.age);
    }


}
