package com.u2.day12.monster;
//蛇类
public class Snake extends Monster{

    public Snake() {
        this.setAttackValue(5);//蛇的初始攻击力为5
    }

    @Override//蛇的攻击
    public void attack(Monster monster) {
        monster.setLifeValue(monster.getLifeValue()-this.getAttackValue());
    }

    @Override//设定蛇的移动方式是曲线移动
    public void move() {
        System.out.println("曲线移动");
    }
    //蛇的回血功能,当生命值小于10时可以回20生命值
    public void bloodReturn(){
        if (this.getLifeValue()<20){
            this.setLifeValue(this.getLifeValue()+20);
        }
    }

    @Override//重写toString方法
    public String toString() {
        return this.getName()+"生命值:"+this.getLifeValue()+"\t攻击力:"+this.getAttackValue();
    }
}
