package com.kgc.u2.day13.seven;

public class Test {
    public static void main(String[] args) {
        Bird bird=new RedBird();
        bird.attack();
        ((RedBird) bird).shut();

        bird=new YellowBird();
        bird.attack();
        ((YellowBird) bird).shut();

        bird=new WhiteBird();
        bird.attack();
        ((WhiteBird) bird).shut();
        //其它同理
    }

}
