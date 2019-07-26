package com.kgc.u3.day17.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
    //属性：学号，姓名，地址
    private int id;
    private String name;
    private String addr;
    //构造方法
    public Student() {
    }
    public Student(int id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }
    //get/set方法
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(addr, student.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addr);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    //主方法
    public static void main(String[] args) {
        Student student1=new Student(1,"xiaohua","wuhan");
        Student student2=new Student(2,"xiaohua","wuhan");
        Student student3=new Student(3,"xiaohua3","wuhan3");
        Student student4=new Student(4,"xiaohua5","wuhan5");
        Student student5=new Student(5,"xiaohua5","wuhan5");
        List<Student> list=new ArrayList<Student>();//连续的序列
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        //注意序列和数组不同，如果从前往后的话，由于索引是变化的，就会产生问题
        //所以从后往前
        for (int i=list.size()-1;i>0;i--){
            for (int j=i-1;j>=0;j--){
                if (list.get(i).equals(list.get(j))){
                    list.remove(i);
                    break;
                }
            }
        }
        Iterator<Student> iterator=list.iterator();//构造一个迭代器
        while (iterator.hasNext()){
            System.out.println(iterator.next());//此处注意要去重写toString方法
        }
    }
}
