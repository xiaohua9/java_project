package com.u2.day13.two;

public class Test {
    public static void main(String[] args) {
        Person person=new Students();
        person.eat();//学生
        person.sleep();//学生
        person=new Leader();
        person.sleep();//领导
        person.eat();//领导
        //其它同理
    }
}
