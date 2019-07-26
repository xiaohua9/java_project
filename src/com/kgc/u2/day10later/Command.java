package com.kgc.u2.day10later;
//简单工厂模式：静态工厂类，抽象父类，各种具体子类，测试类
//静态工厂返回一个向上转型的对象，通过这个对象实现多子类自动识别，这就是多态的主要运用之一，父类作返回值
//补充，父类作形参，同样，核心思想是向上转型，实现多子类自动匹配
//再补充，用完之后，如果有需要，还可以强行转回子类的引用
public class Command {
    public static void main(String[] args) {
        People people=Factory.factory("老师");
        people.speak();
    }
}
