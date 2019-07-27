package com.u1.day4;
import java.util.Scanner;
//根据输入的星期，输出学习计划
public class studyPlan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入星期（如：星期一）：");
        String week=input.next();

        switch (week){
            case "星期一":
                System.out.println("语文");
                break;
            case "星期二":
                System.out.println("数学");
                break;
            case "星期三":
                System.out.println("英语");
                break;
            case "星期四":
                System.out.println("政治");
                break;
            case "星期五":
                System.out.println("历史");
                break;
            case "星期六":
                System.out.println("地理");
                break;
            case "星期天":
                System.out.println("休息");
                break;
                default:
                    System.out.println("您输入了错误星期数");
        }
    }
}
