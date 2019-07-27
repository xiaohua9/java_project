package com.u2.day15.factorymodle;
//工厂模式是简单工厂的升级，解决了增加了个鼠标类需要改动工厂的问题，
//方法是继续利用多态，使工厂也实现动态匹配
//如此设计之下，我们如果要增加一个华硕鼠标，只需要增加鼠标的子类和对应工厂子类，现有代码都不需要改动
//松耦合和开闭原则淋漓尽致
public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new HpMouseFactory();//new创建你想要的一个工厂
        Mouse mouse=abstractFactory.factory();
        mouse.print();
    }
}
