package com.u2.day13.one;

public class WildGoose extends Bird implements Fly,BirdLay {
    @Override
    public void birdLay() {
        System.out.println("大雁在下蛋");
    }

    @Override
    public void fly() {
        System.out.println("大雁在飞行");
    }
}
