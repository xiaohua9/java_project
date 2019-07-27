package com.u1.day3;
import java.util.Scanner;
/*
当成绩判断条件比较复杂时，比如需要同时对Java成绩和音乐成绩同时进行判断时，
就需要使用复杂条件的if选择结构对是否奖励进行判断
（当Java成绩大于90分且音乐成绩大于80分，或者Java成绩等于100分且音乐成绩大于
70分时，给予奖励）
 */
public class JavaMusic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("输入张浩的Java成绩：");
        int javaScore=input.nextInt();
        System.out.print("输入张浩的音乐成绩：");
        int musicScore=input.nextInt();

        if (javaScore>90 && musicScore>80 || javaScore==100 && musicScore>70){
            System.out.println("老师说：不错！奖励一个iPhone5！");
        }
    }
}
