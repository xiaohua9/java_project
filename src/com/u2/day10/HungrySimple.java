package com.u2.day10;
import java.util.Scanner;
//单例模式：自行实例化，并且保证一个类只能有一个实例
// 饿汉单例模式：利用静态先执行的特性，直接构造一个实例，以后都不让构造了
public class HungrySimple {
    private String chairMan;
    static HungrySimple hungrySimple=new HungrySimple();
    private HungrySimple() { }//私有化构造方法

    //获得唯一对象的属性
    public String getChairMan() {
        return this.chairMan;
    }
    //设置唯一对象的属性
    public void setChairMan() {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入总书记的名字：");
        this.chairMan=input.next();
    }
}
