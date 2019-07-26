package com.kgc.u1.day5;
/*龙小华
2019-6-28
输出1-100之间能被7整除的数*/
public class _7_100 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%7==0){
                System.out.println(i);
            }
        }

        System.out.println("以下是水仙花数");
        for (int i=100;i<1000;i++){
            int hundred=i/100%10;
            int ten=i/10%10;
            int ge=i%10;

            if (i==hundred*hundred*hundred+ten*ten*ten+ge*ge*ge){
                System.out.println(i);
            }
        }
    }
}
