package com.kgc.u2.day12.introduce;

public class Athlete extends Person{
    //扩展属性：运动项目，历史最好成绩
    private String subject;
    private double score;

    public Athlete() { }
    public Athlete(String name, int age, String gender, String subject, double score) {
        super(name, age, gender);
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    //实现介绍方法
    @Override
    public void introduce() {
        System.out.println("我叫"+this.getName()+",今年"+this.getAge()+"，我的运动项目是"+this.subject+",历史最好成绩是"+this.score+"分");
    }
}
