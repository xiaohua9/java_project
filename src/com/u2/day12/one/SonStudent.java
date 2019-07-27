package com.u2.day12.one;

public class SonStudent extends Student{
    public SonStudent() {
    }
    public SonStudent(String name, String gender, int age, double high) {
        super(name, gender, age, high);
    }
    //重写toString方法
    @Override
    public String toString() {
        return this.name+this.gender+this.age;//此处是同胞子类，因为身高是类权，因此在这里没有访问的权力
    }
}
