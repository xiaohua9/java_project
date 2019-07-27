package com.u1.day2;
import java.util.Scanner;
//输入一个四位数卡号，然后打印在控制台，并且将卡号的各个位上数字加和，再打印在控制台
public class CardNumberSum {
    public static void main(String[] args) {
        //输入一个四位数卡号，并用变量接收卡号，然后打印在控制台
        System.out.println("请输入一个四位数卡号");
        Scanner input =new Scanner(System.in);
        int cardNumber =input.nextInt();
        System.out.println("您输入的卡号是："+cardNumber);

        //各个位上的数字加和，打印在控制台
        int thousand=cardNumber/1000%10;
        int hundred=cardNumber/100%10;
        int ten=cardNumber/10%10;
        int bit=cardNumber%10;
        int cardNumberSum=thousand+hundred+ten+bit;
        System.out.println("您输入的卡号各个位上的数字总和为："+cardNumberSum);
    }
}
