package com.kgc.u1.day1;

public class Order {

    public static void main(String[] args) {
        int[] arry = {12, 7, 15, 4};
        orderM(arry);
        for (int a = 0; a < arry.length; a++) {
            System.out.println(arry[a]);
        }
    }

    static void orderM(int[] arry) {      //冒泡排序
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }
    }

    public static void orderX(int[] arry) {    //选择排序
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[i] > arry[j]) {
                    int temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }

    }
}


