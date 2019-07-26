package com.kgc.u1.day4;
//计算1000以内所有不能被7整除的整数
public class _7_1000 {
    public static void main(String[] args) {
        int number=0;
        while (number<=1000){
            if (!(number%7==0)) {
                System.out.println(number);
            }
            number++;
        }
    }
}
