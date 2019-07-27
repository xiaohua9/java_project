package com.u1.day4;
//使用三种循环方式计算100以内的偶数之和，含100
public class EvenIn100 {
    public static void main(String[] args) {
        int sum=0,i=0;

        while (i<=100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("while方法100以内的偶数之和为："+sum);


        sum=0;
        i=0;
        do {
            if (i%2==0) {
                sum += i;
            }
            i++;
        }while (i<=100);
        System.out.println("do-while方法100以内的偶数之和为："+sum);

        sum=0;
        i=0;
        for (;i<=100;i++){
            if (i%2==0) {
                sum += i;
            }
        }
        System.out.println("for方法100以内的偶数之和为："+sum);
    }
}
