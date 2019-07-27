package com.u1.day4;
import java.util.Scanner;
//判断是平年还是闰年，能被4整除且不能被100整除或者能被400整除
public class runYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year=input.nextInt();

        if (year%4==0&&year%100!=0 || year%400==0){
            System.out.println(year+" is"+"闰年");
        }else {
            System.out.println(year +"is"+"平年");
        }
    }
}
