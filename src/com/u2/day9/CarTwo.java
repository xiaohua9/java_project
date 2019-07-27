package com.u2.day9;
import java.util.Scanner;
public class CarTwo {
    String name="客车";
    String carName;
    String carColour;
    String carWhere;
    int speed=100;
    static Scanner input=new Scanner(System.in);
    //构造方法
    public CarTwo(){ }
    public CarTwo(String carName,String carColour,String carWhere){
        this.carName=carName;
        this.carColour=carColour;
        this.carWhere=carWhere;
    }
    public void run(){
        System.out.print("你在"+this.carWhere+",你想去哪：");
        this.carWhere=input.next();
        System.out.println("你开着"+this.carColour+"的"+this.carName+"在去"+this.carWhere+"的路上了");
    }
    public void run(int speed){
        this.speed=speed;
        System.out.println("您的车速是："+this.speed);
    }



}
