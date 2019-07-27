package com.u2.day13.one;
//蜜蜂类，继承昆虫类，实现飞行和产卵的接口
public class Honeybee extends Insect implements Fly,InsectLay{
    @Override
    public void fly() {
        System.out.println("蜜蜂正在飞行");
    }

    @Override
    public void insectLay() {
        System.out.println("蜜蜂正在产卵");
    }
}
