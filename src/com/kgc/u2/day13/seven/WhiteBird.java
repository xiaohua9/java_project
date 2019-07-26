package com.kgc.u2.day13.seven;

public class WhiteBird extends Bird implements Shut{
    @Override
    public void attack() {
        System.out.println("下蛋攻击");
    }

    @Override
    public void shut() {
        System.out.println("嗷嗷");
    }
}
