package com.u2.day13.seven;

public class YellowBird extends Bird implements Shut {
    @Override
    public void attack() {
        System.out.println("加速撞击");
    }

    @Override
    public void shut() {
        System.out.println("喳喳");
    }
}
