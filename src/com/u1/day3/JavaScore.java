package com.u1.day3;
import java.util.Scanner;
//根据键盘输入的Java成绩，正确使用基本if选择结构对成绩进行判断（当成绩大于90分时，给予奖励）
public class JavaScore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("输入张浩的Java成绩：");
        int javaScore=input.nextInt();

        if (javaScore>90){
            System.out.println("老师说：不错！奖励一个iPhone5！");
        }
    }
}
