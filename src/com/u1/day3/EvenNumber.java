package com.u1.day3;
import java.util.Scanner;
//输入一个数，然后判断是不是偶数
public class EvenNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个数：");
        int evenNumber=input.nextInt();
        if (evenNumber%2==0){
            System.out.println(evenNumber+"是偶数");
        }

    }
}
