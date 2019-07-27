package com.u1.day4;
//输出1-50中的能被3且5整除的数，再加和输出
public class _3_5Dowhile {
    public static void main(String[] args) {
        int num =1;
        int sum=0;
        do {
            if (num%3==0 && num%5==0) {
                System.out.println(num);
                sum +=num;
            }
            num++;
            }while (num<51);
        System.out.println("和为"+sum);
        }
}
