package com.kgc.u2.day11;

public class Animal {
    private String name;
    private int age;
    private String colour;

    public Animal() {
    }

    public Animal(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void run(){
        System.out.println(this.name+"正在跑");
    }
}
