package com.kgc.u1.day3;
import java.util.Scanner;
//判断卡号是否中奖
public class WinPrize {
    public static void main(String[] args) {
        //四位会员卡号的输入
        Scanner input=new Scanner(System.in);
        System.out.println("请输入四位会员卡号：");
        int cardNumber=input.nextInt();
        System.out.println("会员卡号是："+cardNumber);

         //各个位上的数字的提取，并输出
        int thousand=cardNumber/1000%10;
        int hundred=cardNumber/100%10;
        int ten=cardNumber/10%10;
        int bit=cardNumber%10;
        System.out.println("千位数："+thousand+",百位数："+hundred+",十位数："+ten+",个位数："+bit);

         //输出会员卡号的各位之和
        int cardNumberSum=thousand+hundred+ten+bit;
        System.out.println("会员卡号"+cardNumber+"各位之和："+cardNumberSum);

        if (cardNumberSum>20){
            System.out.println("会员卡号"+cardNumber+"的会员，您中奖了！奖品是mp3！");
        }
    }
}
