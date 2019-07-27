package com.u2.day9;
//薪水计算类
public class Salary {
    public void calc(Employee employee){
        System.out.println("员工的基本工资："+employee.salary+"\t员工的考核工资："+employee.addSalary+"\t总工资："+(employee.salary+employee.addSalary));
    }
    public void calc(Manager manager){
        System.out.println("经理的基本工资："+manager.salary+"\t经理的项目工资："+manager.projectSalary+"\t经理的分红："+manager.bonus+"\t"+"总工资："+(manager.salary+manager.projectSalary+manager.bonus));
    }
}
