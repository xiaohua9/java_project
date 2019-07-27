package com.u1.day5;
/*龙小华
2019-6-28
99乘法表*/
public class ChengFaBiao {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println(" ");
        }
    }

}
