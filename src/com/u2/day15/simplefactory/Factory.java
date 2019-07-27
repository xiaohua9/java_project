package com.u2.day15.simplefactory;
//简单工厂的弊端是，当添加一个鼠标类，那就需要修改工厂类的工厂方法，违背了开闭原则
public class Factory {
    public static Mouse factory(int i){
        if(i==1){
            return new HpMouse();
        }else if (i==2){
            return new DellMouse();
        }else {
            return null;
        }
    }
}
