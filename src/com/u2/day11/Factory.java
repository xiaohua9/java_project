package com.u2.day11;
import java.util.Scanner;
//静态工厂
public class Factory {
    public static Employee factory(){
        Scanner input=new Scanner(System.in);
        System.out.print("请问你要计算经理的工资还是员工的？");
        String tmp=input.next();
        if ("经理".equals(tmp)){
            return new Manager("李四","武汉",1,1000,2,"2");
        }else {
            return new Employee("张三","武汉",1,1000,2);
        }
    }
}
