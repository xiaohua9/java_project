package com.u2.day11;

public class TestAddSalary {
    public static void main(String[] args) {
        //多态运用，动态绑定
        Employee employee=Factory.factory();
        employee.add();
        System.out.println(employee.getSalary());
    }
}
