package com.u2.day12.monster;
//怪物类
public abstract class Monster {
    //属性：名字，生命值，攻击力
    private String name;
    private int lifeValue=100;//怪物的初始生命值
    private int attackValue;
    //set/get方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLifeValue() {
        return lifeValue;
    }
    public void setLifeValue(int lifeValue) {
        if (lifeValue<0){
            this.lifeValue=0;
        }else {
            this.lifeValue = lifeValue;
        }
    }
    public int getAttackValue() {
        return attackValue;
    }
    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    //攻击方法
    public abstract void attack(Monster monster);
    //移动方法
    public abstract void move();
}
