package com.u1.day5;
//输出等腰三角形
public class DengYaoSanJiao {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3-i;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i=3;i>0;i--){//倒等腰三角形
            for (int j=1;j<=3-i;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
