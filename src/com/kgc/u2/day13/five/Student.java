package com.kgc.u2.day13.five;

public class Student extends People {
    private String gender;
    //构造方法
    public Student() {}
    public Student(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }
    //set/get方法
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "姓名："+this.getName()+",年龄："+this.getAge()+",性别："+this.getGender();
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }
}
