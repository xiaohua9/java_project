package com.kgc.u1.day4;
//首先获取键盘录入的学生姓名，然后正确使用for循环，
// 循环获取某同学的S1结业考试的5门课成绩，最后计算平均分并输出
import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int courseNumber=1;
        String studentName;
        double score =0;

        System.out.print("请输入学生姓名：");
        studentName=input.next();
        while (courseNumber<=5){
            System.out.print("请输入5门功课中第"+courseNumber+"门课的成绩：");
            score+=input.nextDouble();
            courseNumber++;
        }
        System.out.println(studentName+"的平均分是："+(score/5));


    }
}
