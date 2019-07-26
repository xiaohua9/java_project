package com.kgc.u3.day17.two;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//员工操作工具类
public class EmployeeUtil {
    List<Employee> list=new LinkedList<Employee>();//员工资料库
    private static Scanner input=new Scanner(System.in);
    //添加员工
    public void addEmployee(){
        Employee employee=new Employee();
        System.out.print("请输入员工编号：");
        employee.setEmployeeId(input.next());
        System.out.print("请输入员工姓名：");
        employee.setEmployeeName(input.next());
        System.out.print("请输入员工工资：");
        employee.setEmployeeSalary(input.nextDouble());
        if (!list.contains(employee)){ //不存在才添加，在此之前去去重写hashcode和equals
            list.add(employee);
        }
    }
    //查询某一个员工的信息（根据员工编号）
    public void select(){
        System.out.print("请输入员工编号：");
        String tmpId=input.next();
        Employee employee=new Employee();//临时的员工，用于与资料库比对
        employee.setEmployeeId(tmpId);
        if (!list.contains(employee)){
            System.out.println("该员工编号不存在");
        }else {
            System.out.println(list.get(list.indexOf(employee)));//前提：先去重写toString
        }
    }
    //显示主页菜单
    public void headPage(){
        System.out.println("------------------------------------");
        System.out.println("1.添加员工\n2.查询某一个员工\n3.显示所有员工\n4.修改员工工资\n5.删除员工\n6.退出系统");
        System.out.println("------------------------------------------");
        System.out.println("请选择：");
    }
    //显示所有员工的信息
    public void showInfo(){
        Iterator<Employee> iterator=list.iterator();//构建迭代器
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    //修改员工工资（根据编号）
    public void changeSalary(){
        System.out.print("请输入员工编号：");
        String tmpId=input.next();
        Employee employee=new Employee();//临时的员工，用于与资料库比对
        employee.setEmployeeId(tmpId);
        if (!list.contains(employee)){
            System.out.println("该员工编号不存在");
        }else {
            System.out.print("请输入员工的新工资：");
            list.get(list.indexOf(employee)).setEmployeeSalary(input.nextDouble());//前提：先去重写toString
        }
    }
    //删除员工（根据员工编号）
    public void delete(){
        System.out.print("请输入员工编号：");
        String tmpId=input.next();
        Employee employee=new Employee();//临时的员工，用于与资料库比对
        employee.setEmployeeId(tmpId);
        if (!list.contains(employee)){
            System.out.println("该员工编号不存在");
        }else {
            list.remove(list.indexOf(employee));//前提：先去重写toString
        }
    }
}
