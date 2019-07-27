
//两种方式输出指定数量的斐波拉契数
//1、普通方式
//2、递归方式
package com.u1.day6;

public class FeiBoLaQi {
    public static void main(String[] args) {
        System.out.println("普通方式");//如果k是奇数，输出k+1个数，如果数偶数，输出k个数
        int i=1;
        int j=1;
        int k=8;
        for (int h=1;h<=k;h+=2){
            System.out.print(i+","+j+",");
            i=i+j;
            j=i+j;
        }
        System.out.println("\n-----------------------------------------------------");

        System.out.println("递归方式");
        for (i=1;i<=8;i++){
            System.out.print(fblq(i));
            if (i!=8){
                System.out.print(",");
            }
        }
    }
    public static int fblq(int num){
        if (num==1){
            return 1;
        }else if (num==2){
            return 1;
        }else {
            return fblq(num-1)+fblq(num-2);
        }
    }
}
