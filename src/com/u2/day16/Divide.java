package com.u2.day16;
import java.util.Scanner;
public class Divide {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入被除数：");
        int num1=input.nextInt();
        System.out.print("请输入除数：");
        int num2=input.nextInt();
        try {
            int result=num1/num2;
            System.out.println("商为："+result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }
}
