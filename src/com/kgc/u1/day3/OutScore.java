package com.kgc.u1.day3;
import java.util.Scanner;
/*
当成绩大于等于80分时成绩评测为“良好”，
当成绩小于80分但是大于等于60分时成绩评测为“中等”，
否则成绩评测为“差”
 */
public class OutScore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入考试成绩：");
        int score=input.nextInt();
        if (score>=80){
            System.out.println("良好");
        }else if (score>=60){
            System.out.println("中等");
        }else{
            System.out.println("差");
        }

    }
}
