package com.kgc.u1.day4;
//输出100以内5的倍数，含100
public class Mutipal5In100 {
    public static void main(String[] args) {
        int step=5;
        int number=100;
        do {
            System.out.println(number);
            number-=step;
        }while (number!=0);
    }
}
