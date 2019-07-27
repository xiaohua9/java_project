package com.u1.day4;
//输出加法表
import java.util.Scanner;

public class PlusTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个值：");
        int number=input.nextInt();
        int temp=number;
        System.out.println("根据这个值可以输出以下加法表：");

        for (int i=0;i<=temp;i++,number--){
            System.out.println(i+"+"+number+"="+(i+number));
        }
    }

}
