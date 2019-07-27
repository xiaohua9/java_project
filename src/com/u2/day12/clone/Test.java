package com.u2.day12.clone;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student(12);
        Student student1=student.clone();//克隆一个对象
        System.out.println(student.equals(student1));//false说明了克隆成功
        System.out.println(student.getAge());//对象的属性值一样，对象的引用不一样
        System.out.println(student1.getAge());
    }
}
