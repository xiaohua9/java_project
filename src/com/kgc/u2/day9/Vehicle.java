package com.kgc.u2.day9;
import java.util.Scanner;
//交通工具类
public class Vehicle {
    String name="货车";
    int speed;
    double size;
    static Scanner input=new Scanner(System.in);
    //设置速度
    public void setSpeed(int speed){
        this.speed=speed;
    }
    //设置体积
    public void setSize(double size){
        this.size=size;
    }
    //加速
    public void upSpeed(){
        System.out.print("您要加多少速度：");
        this.speed+=input.nextInt();
        System.out.println("加速成功\n速度值："+this.speed+"\t体积值："+this.size);
    }
    //减速方法，当减速值大于等于当前车速，统一改为0
    public void downSpeed(){
        System.out.print("您要减多少速度：");
        int tmpSpeed=input.nextInt();

        if (tmpSpeed>=this.speed){
            this.speed=0;
            System.out.println("减速成功\n速度值："+this.speed+"\t体积值："+this.size);
        }else {
            this.speed-=tmpSpeed;
            System.out.println("减速成功\n速度值："+this.speed+"\t体积值："+this.size);
        }
    }
    //输出速度值和体积值
    public void outInfo(){
        System.out.println("速度值："+this.speed+"\t体积值："+this.size);
    }

}
