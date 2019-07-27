package com.u2.day12.animal;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.speak(new Dog());
        //首先这种向上转型，肯定不会调用dog的 public void speak(Dog dog)方法
        // 其次speak（Animal animal） 方法子类重写了，而dog会调用子类该方法，并产生一个自动向上转型
    }
}
