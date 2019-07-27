package com.u1.day4;
import java.util.Scanner;
//输入月份，输出该月有几天
public class MonthDays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入一个月份数（如：1）：");
        int month=input.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+"有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"有30天");
                break;
            case 2:
                System.out.println(month+"有28天");
                default:
                    System.out.println("输入错误");

        }
    }
}
