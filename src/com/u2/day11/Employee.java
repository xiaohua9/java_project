package com.u2.day11;
//员工类
public class Employee extends People {
    private int id;
    private double salary;
    private int workAge;

    //构造方法
    public Employee() {
    }

    public Employee(String name, String address, int id, double salary, int workAge) {
        super(name, address);
        this.id = id;
        this.salary = salary;
        this.workAge = workAge;
    }
    //get和set方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    //加工资方法涨10%
    public  void add(){
        this.setSalary(this.getSalary()*1.1);
    }

}
