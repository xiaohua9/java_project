package com.u1.day4;
//实现加减乘除的计算器功能
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String begain="y";

        while ("y".equals(begain)) {
            System.out.print("请输入第一个数：");
            double num1 = input.nextDouble();
            System.out.print("请输入第二个数：");
            double num2 = input.nextDouble();
            System.out.print("请输入运算符+-*/：");
            String calc = input.next();

            switch (calc) {
                case "+":
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                    break;
                case "/":
                    if (num2==0){
                        System.out.println("错误，num2不能为0");
                        break;
                    }else {
                        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                        break;
                    }
                default:
                    System.out.println("运算符输入错误");
                    break;
            }
            do {
                System.out.println("是否继续（y/n）：");
                begain=input.next();
            }while (!"y".equals(begain) && !"n".equals(begain));
        }
    }

}
