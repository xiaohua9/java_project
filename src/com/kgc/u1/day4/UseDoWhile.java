package com.kgc.u1.day4;
//do while  的简单练习
import java.util.Scanner;

public class UseDoWhile {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String upToStandard="n";
        do {
            System.out.println("上机编写程序！");
            System.out.print("合格了吗？（y/n）");
            upToStandard=input.next();
        }while (!"y".equals(upToStandard));
        System.out.println("恭喜你通过了测试！");
    }
}
