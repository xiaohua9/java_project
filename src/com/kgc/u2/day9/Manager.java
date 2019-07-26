package com.kgc.u2.day9;
//经理类
public class Manager {
    double salary;
    double projectSalary;
    double bonus;
    //重载构造方法
    public Manager(){}
    public Manager(double salary,double projectSalary,double bonus){
        this.salary=salary;
        this.projectSalary=projectSalary;
        this.bonus=bonus;
    }
}
