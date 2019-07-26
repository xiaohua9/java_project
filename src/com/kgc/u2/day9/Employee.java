package com.kgc.u2.day9;
//员工类
public class Employee {
    //属性：基本工资，考核工资
    double salary;
    double addSalary;
    //重载构造方法
    public Employee(){}
    public Employee(double salary,double addSalary){
        this.salary=salary;
        this.addSalary=addSalary;
    }
}
