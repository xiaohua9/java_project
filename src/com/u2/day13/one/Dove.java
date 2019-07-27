package com.u2.day13.one;
//鸽子类，继承鸟类
public class Dove extends Bird implements Fly,BirdLay{
    @Override
    public void birdLay() {
        System.out.println("鸽子生蛋中");
    }
    @Override
    public void fly() {
        System.out.println("鸽子飞行中");
    }
}
