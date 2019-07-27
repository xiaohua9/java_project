package com.u2.day10later.Exception;

public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0&&age<120) {
            this.age = age;
        }else {
            try {
                throw new InException();
            } catch (InException e) {
               // e.printStackTrace();//打印堆栈的错误跟踪
            }
            finally {
                System.out.println("请重新输入");
            }
        }
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.setAge(130);
        System.out.println(student.getAge());
    }

}
