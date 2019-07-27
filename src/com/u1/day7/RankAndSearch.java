/*
     龙小华
     2019-7-2
    功能： 实现选择排序，冒泡排序和折半查找
 */
package com.u1.day7;

import java.util.Arrays;

public class RankAndSearch {
    public static void main(String[] args) {
        double[] number={12,90,100,67,89,};
        for (int i=0;i<number.length;i++){
            System.out.print(number[i]);
            if (i!=number.length-1){
                System.out.print("\t");
            }
        }
        System.out.println();

       /* mySelectSort(number);
        myBobSearch(number);

        for (int i=0;i<number.length;i++){
            System.out.print(number[i]);
            if (i!=number.length-1){
                System.out.print("\t");
            }
        }
        System.out.println();

        int index=myBinarySearch(number,67);
        System.out.println(index);*/
       //
        //被注释掉的是自己写的原始方法
        //下面使用调用API的方式实现
        Arrays.sort(number);
        for (int i=0;i<number.length;i++){
            System.out.print(number[i]);
            if (i!=number.length-1){
                System.out.print("\t");
            }
        }
        System.out.println();
        int index=Arrays.binarySearch(number,12);
        System.out.println(index);
    }



    //this is the method of mySelectSort
    public static void mySelectSort(double[] number){
        for (int i=0;i<number.length-1;i++){
            for (int j=i+1;j<number.length;j++){
                if (number[i]>number[j]) {
                    double tmp = number[i];
                    number[i]=number[j];
                    number[j]=tmp;
                }
            }
        }
    }
    //this is the method of myBobSort
    public static void myBobSearch(double[] number){
        for (int i=0;i<number.length-1;i++){
            for (int j=0;j<number.length-1-i;j++){
                if (number[j]>number[j+1]){
                    double tmp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=tmp;
                }
            }
        }
    }
    //this is the method of myBinarySearch
    public static int myBinarySearch(double[] arry,double number){
        int max=arry.length-1;
        int min=0;
        while (min<=max){
            int mid =(max+min)/2;
            if (arry[mid]>number){
                max=mid-1;
            }else if (arry[mid]<number){
                min=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
