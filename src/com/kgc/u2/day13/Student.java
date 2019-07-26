package com.kgc.u2.day13;

import java.util.Objects;

public class Student {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    public static void main(String[] args) {
        Student student=new Student();
        student.age=23;
        student.name="xiaohua";

        Student student1=new Student();
        student1.age=23;
        student1.name="xiaohua";
        System.out.println(student==student1);
        System.out.println(student.equals(student1));

    }
}
