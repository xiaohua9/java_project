package com.u1.day4;
import java.util.Scanner;
//输入年月日，输出该天是今年的第几天

public class WhichDayth {
    public static void main(String[] args) {
        String begain="yes";
        do {

            //定义输入接口，并输入年月日
            Scanner input = new Scanner(System.in);
            System.out.print("请输入年（如2019）：");
            int year = input.nextInt();
            System.out.print("请输入月数（如1）：");
            int month = input.nextInt();
            System.out.print("请输入号数（如20）：");
            int day = input.nextInt();

            int sum = 0;//累计加总天数
/*
        根据输入的月份选择相应的进入口，这里是利用了switch分支的性质，将缺点转化为功能，充分利用其性能，、
        当case中没有break时，它会继续往下执行，那么我们就从12月开始，通过这一性能实现天数加总。
 */
            switch (month) {
                case 12:        //12月不存在下滚
                    sum += day;
                case 11:      //当输入是11月时，说明sum等于1-10月加11月的号数
                    if (month == 11) {
                        sum += day;
                    } else {    //当输入不是11月，但下滚到11月，那说明11月是全额加总。以下同理
                        sum += 30;
                    }
                case 10:
                    if (month == 10) {
                        sum += day;
                    } else {
                        sum += 31;
                    }
                case 9:
                    if (month == 9) {
                        sum += day;
                    } else {
                        sum += 30;
                    }
                case 8:
                    if (month == 8) {
                        sum += day;
                    } else {
                        sum += 31;
                    }
                case 7:
                    if (month == 7) {
                        sum += day;
                    } else {
                        sum += 31;
                    }
                case 6:
                    if (month == 6) {
                        sum += day;
                    } else {
                        sum += 30;
                    }
                case 5:
                    if (month == 5) {
                        sum += day;
                    } else {
                        sum += 31;
                    }
                case 4:
                    if (month == 4) {
                        sum += day;
                    } else {
                        sum += 30;
                    }
                case 3:
                    if (month == 3) {
                        sum += day;
                    } else {
                        sum += 31;
                    }
                case 2:   //2月需要判断闰年，输入2月无需判断，下滚来的就需要判断了，加28/29
                    if (month == 2) {
                        sum += day;
                    } else if (month != 2) {
                        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                            sum += 29;
                        } else {
                            sum += 28;
                        }
                    }
                case 1:
                    if (month == 1) {
                        sum += day;
                    } else {
                        sum += 31;
                    }
                    break;  //结束天数累加
                default:
                    System.out.println("输入错误");
                    break;
            }
            System.out.println("今天是" + year + "的第" + sum + "天");

            do {//强行要求是输入yes/no是否继续，不许乱来
                System.out.println("是否继续（yes/no）");
                begain=input.next();
            }while (!"yes".equals(begain) && !"no".equals(begain));
        }while (begain.equals("yes"));
    }
}
