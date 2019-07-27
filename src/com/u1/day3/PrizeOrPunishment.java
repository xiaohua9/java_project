package com.u1.day3;
import java.util.Scanner;
/*
正确使用if-else选择结构，输出如果所示的奖惩信息，当成绩大于90分给予奖励，否则进行惩罚。
 */
public class PrizeOrPunishment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("输入张浩的Java成绩：");
        int javaScore =input.nextInt();

        if (javaScore>90){
            System.out.println("老师说：不错！奖励一个iPhone5！");
        }else {
            System.out.println("老师说：惩罚蹲五分钟马步！");
        }
    }
}
