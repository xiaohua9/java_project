package com.u1.day3;
import java.util.Scanner;
/*
当成绩小于等于“10秒”时，选手有资格进入决赛，
对于进入决赛的选手再对性别“男和女”分别进入“男子组决赛”或“女子组决赛”
 */
public class GroupStudent {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入比赛成绩（s）：");
        double score =input.nextDouble();
        System.out.print("请输入性别：");
        String gender=input.next();

        if (score<=10){
            if (gender.equals("男")){
                System.out.println("进入男子决赛组！");
            }else if (gender.equals("女")){
                System.out.println("进入女子决赛组！");
            }else {
                System.out.println("人妖不许比赛");
            }
        }

    }
}
