package com.kgc.u2.day12.clone;
//重写克隆的练习
public class Student {
    private int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override//重写Object的克隆方法
    public Student clone() throws CloneNotSupportedException {
        Student student=new Student(this.getAge());
        return student;
    }
}
