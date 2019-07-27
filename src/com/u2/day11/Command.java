package com.u2.day11;
//老师继承学生，学生继承人，即可以得到父类的东西，还可以产生自己的新东西，
//子类不仅能继承直接父类的东西，还能继承间接父类的东西
public class Command {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("小华");
        student.eat();
        student.study();

        Teacher teacher=new Teacher();
        teacher.setName("小明");
        teacher.eat();
        teacher.study();
        teacher.checkTask();
    }
}
