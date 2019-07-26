package com.kgc.u1.day2;
import java.util.Scanner;

//本息计算，输入本金，计算一年、两年、三年、五年后的本息
public class PrincipalAndInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入本金：");
        double principal =input.nextDouble();
        System.out.println("您的本金为："+principal);

        //以下是本息计算
        System.out.println("存取一年后的本息是："+(principal*0.0225+principal));
        System.out.println("存取两年后的本息是："+(principal*0.027*2+principal));
        System.out.println("存取三年后的本息是："+(principal*0.0324*3+principal));
        System.out.println("存取五年后的本息是："+(principal*0.036*5+principal));
    }
}
