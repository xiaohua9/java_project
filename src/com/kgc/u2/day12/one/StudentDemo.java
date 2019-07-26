package com.kgc.u2.day12.one;

public class StudentDemo {
    public static void main(String[] args)throws CloneNotSupportedException  {
        Student student=new Student("xiaohua","man",23,168);
        //"student."//只有类权的身高不能访问
        System.out.println(student);//调用toSstring
        Student student1=student.clone();
        System.out.println(student.equals(student1));//克隆成功
    }
}
