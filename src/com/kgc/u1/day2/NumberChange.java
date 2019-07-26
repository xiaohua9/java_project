package com.kgc.u1.day2;
import java.util.Scanner;

//功能：两个数值的位置交换
public class NumberChange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1=input.nextInt();
        System.out.println("请输入第二个数字：");
        int num2=input.nextInt();
        System.out.println("第一个数是："+num1);
        System.out.println("第二个数是："+num2);

        //接下来是进行数据交换
        int temp =num1;
        num1=num2;
        num2=temp;

        //输出交换后的数据
        System.out.println("以下是交换后的数据");
        System.out.println("第一个数是："+num1);
        System.out.println("第二个数是："+num2);

    }
}
