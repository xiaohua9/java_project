package com.kgc.u3.day17.two;
import java.util.Scanner;
//控制中心
public class Controller {
    public static void main(String[] args) {
        EmployeeUtil controller = new EmployeeUtil();//生成一个控制者
        Scanner input=new Scanner(System.in);//输入扫描器
        do {
            controller.headPage();//显示首页
            switch (input.next()){
                case "1":
                    controller.addEmployee(); //添加员工
                    break;
                case "2":
                    controller.select();//查询员工
                    break;
                case "3":
                    controller.showInfo();//显示所有员工的信息
                    break;
                case "4":
                    controller.changeSalary();//修改某一个员工的工资
                    break;
                case "5":
                    controller.delete();//删除员工
                    break;
                case "6":
                    System.exit(0);//退出系统
                    default:
                        System.out.println("输入错误！");
                        break;
            }
        }while (true);
    }
}
