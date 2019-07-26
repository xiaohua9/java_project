package com.kgc.u3.day22.one;

public class Student{
    private int id;
    private String name;
    private int age;
    private Classes classes;//用于表示这个学生是那个班的

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                '}';
    }
}

