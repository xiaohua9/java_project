package com.kgc.u1.day1;
import java.util.Scanner;
public class Mids {
    public static void main (String[] args){
        int[] arry = new int[100];
        for (int i =0; i<arry.length; i++){
            arry[i] =i;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的数字：");
        int number = sc.nextInt();
        int max = arry.length-1;
        int min = 0;
        System.out.println("请稍等");
        while (min<=max){
            int mid = (max + min) / 2;
            if (number>arry[mid]){
                min=mid+1;
            }else if(number<arry[mid]){
                max= mid -1;
            }else {
                System.out.println("你查询的数字是序列的第"+ (mid+1) +"个");
                break;
            }
        }
    }
}

