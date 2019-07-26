package com.kgc.u1.day5;
/*龙小华
2019-6-28
输出1-100的非3和5公倍数的偶数*/
public class Even_100 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%3==0&&i%5==0){
                continue;
            }
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
