package com.kgc.u2.day9;
import java.util.Scanner;

//汽车类
public class Car {
    //属性：车牌号，车速，载重量
    String name="轿车";
    String carNumber;
    int speed;
    double heavy;

    static Scanner input=new Scanner(System.in);//构造一个类公共输入扫描器
    //重载构造方法
    public Car(){
        this.carNumber="xx1234";
        this.speed=100;
        this.heavy=100;
    }
    public Car(String carNumber,int speed,double heavy){
        this.carNumber=carNumber;
        this.speed=speed;
        this.heavy=heavy;
    }
    //加速方法
    public void upSpeed(){
        System.out.print("您要加多少速度：");
        this.speed+=input.nextInt();
        System.out.println("加速成功，当前速度："+this.speed);
    }
    //减速方法，当减速值大于等于当前车速，统一改为0
    public void downSpeed(){
        System.out.print("您要减多少速度：");
        int tmpSpeed=input.nextInt();

        if (tmpSpeed>=this.speed){
            this.speed=0;
            System.out.println("减速成功，当前速度："+this.speed);
        }else {
            this.speed-=tmpSpeed;
            System.out.println("减速成功，当前速度："+this.speed);
        }
    }
    //修改车牌方法
    public void chengeCarNumber(){
        System.out.print("请输入新车牌号：");
        this.carNumber=input.next();
        System.out.println("修改成功，当前车牌号为："+this.carNumber);
    }
    //查询载重量方法
    public void selectHeavy(){
        System.out.println("此车的载重量是："+this.heavy);
    }
    //输出所有信息
    public void allInfo(){
        System.out.println("车牌号："+this.carNumber);
        System.out.println("车\t速："+this.speed);
        System.out.println("载重量："+this.heavy);
    }
    public void methodSpeek(){
        System.out.println("-->我现在是汽车生产、设置大王");
    }

}
