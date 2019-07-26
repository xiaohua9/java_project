package com.kgc.u2.day12.one;

public class Student extends Person {

    //通过调用父类的构造方法来完成子类的构造方法
    public Student() {
    }

    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Student(String name, String gender, int age, double high) {
        super(name, gender, age, high);
    }

    //重写toString方法
    @Override
    public String toString() {
        return this.name+this.gender+this.age;//此处是同胞子类，因为身高是类权，因此在这里没有访问的权力
    }

    @Override//实现抽象父类的eat抽象方法
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)){
            return false;
        }else {
            Student student=(Student)obj;
            if (this.name.equals(student.name)&&this.age==student.age){
                return true;
            }else {
                return false;
            }
        }
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student=new Student(this.name, this.gender,this.age);
        return student;
    }
}
