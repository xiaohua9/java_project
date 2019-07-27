package com.u1.day4;
//输出1-50中的能被3且5整除的数，再加和输出
public class _3_5While {
    public static void main(String[] args) {
        int num =1;
        int sum=0;
        while(num<=50){
            if (num%3==0 && num%5==0) {
                System.out.println(num);
                sum +=num;
            }
            num++;
        }
        System.out.println("和为"+sum);
    }
}
