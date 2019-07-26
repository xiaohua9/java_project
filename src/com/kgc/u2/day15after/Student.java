package com.kgc.u2.day15after;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int age;
    String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
