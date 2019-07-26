package com.kgc.u2.day12.monster;
//蜈蚣类
public class Centipede extends Monster{
    public Centipede() {
        this.setAttackValue(8);//蜈蚣的初始攻击力为8
    }
    @Override//攻击
    public void attack(Monster monster) {
        monster.setLifeValue(monster.getLifeValue()-this.getAttackValue());
    }

    @Override//移动
    public void move() {
        System.out.println("飞行移动");
    }
    @Override//重写toString方法
    public String toString() {
        return this.getName()+"生命值:"+this.getLifeValue()+"\t攻击力:"+this.getAttackValue();
    }
}
