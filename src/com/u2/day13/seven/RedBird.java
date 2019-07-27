package com.u2.day13.seven;

public class RedBird extends Bird implements Shut {
    @Override
    public void attack() {
        System.out.println("投撞");
    }

    @Override
    public void shut() {
        System.out.println("噢噢");
    }
}
