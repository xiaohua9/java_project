package com.kgc.u1.day4;
//从控制台输入一个数n，使用for循环实现求n!。提示：n!=n*(n-1)*(n-2)*...*1
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入您要进行阶乘运算的数：");
        int number=input.nextInt();
        int i=1;//阶乘值
        for (int j=1;j<=number;j++){
            i=i*j;
        }
        System.out.println(number+"的阶乘等于："+i);

    }
}
