package com.u2.day12.introduce;

public class Test {
    public static void main(String[] args) {
        Person actor=new Actor("rose",24,"woman","中央美院","小女孩");
        Person athlete=new Athlete("tom",23,"man","跳远",90);
        actor.introduce();
        athlete.introduce();
    }
}