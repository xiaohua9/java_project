package com.kgc.u2.day9;
import java.util.Scanner;
public class People {
    //四个属性：姓名，年龄，性别，身高
    String name;
    int age;
    char gender;
    double high;

    public People(){}//源构造方法
    //重载构造方法
    public People(String name,int age,char gender,double high){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.high=high;
    }
    //说话的成员方法
    public void speek(){
        System.out.println("大家好！我叫"+this.name+",今年"+this.age+"岁,我的身高是"+this.high+"m");
    }
    //计算加法的成员方法
    public void plus(){
        Scanner input=new Scanner(System.in);
        System.out.println("-->现在我是加法达人");
        System.out.print("请输入第一个数：");
        double num1=input.nextDouble();
        System.out.print("请输入第二个数：");
        double num2=input.nextDouble();
        System.out.println(num1+"+"+num2+"="+(num1+num2));
    }
    //改名的成员方法
    public void changeName(){
        System.out.print("-->现在改名，请输入新名字：");
        Scanner input=new Scanner(System.in);
        String name=input.next();
        this.name=name;
        System.out.println("OK,我现在叫"+this.name+",今年"+this.age+"岁,我的身高是"+this.high+"m");
    }
}
