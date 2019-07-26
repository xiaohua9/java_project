package com.kgc.u2.day13.one;
//蚂蚁类，继承昆虫类，实现飞行和产卵的接口
public class Ant extends Insect implements Fly,InsectLay{
    @Override
    public void fly() {
        System.out.println("蚂蚁正在飞行");
    }

    @Override
    public void insectLay() {
        System.out.println("蚂蚁正在产卵");
    }
}
