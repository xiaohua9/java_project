package com.kgc.u2.day11;
//经理类
public class Manager extends Employee {
    //添加级别属性
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Manager() {
    }

    public Manager(String name, String address, int id, double salary, int workAge, String level) {
        super(name, address, id, salary, workAge);
        this.level = level;
    }

    @Override//重写加工资方法，使经理能够涨20%
    public void add() {
        this.setSalary(this.getSalary()*1.2);
    }
}
