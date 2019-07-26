package com.kgc.u2.day15.abstractfactory;
//抽象工厂在工厂模式的基础上强化，工厂模式只能生产一种东西，而抽象工厂可以生产多中东西
//比如说，你生产电脑，你需要同时生产鼠标、键盘、显示屏，等等，这就需要抽象工厂模式
public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new HpFactory();
        Keyboard keyboard=abstractFactory.factoryKeyboard();
        Mouse mouse=abstractFactory.factoryMouse();
        keyboard.print();
        mouse.print();
    }
}
