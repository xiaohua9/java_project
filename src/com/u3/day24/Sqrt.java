package com.u3.day24;
//已知 sqrt (2)约等于 1.414，要求不用数学库，求 sqrt (2)精确到小数点后 10 位
public class Sqrt {
    public static void main(String[] args) {
        double max=1.5;
        double min=1.4;
        double mid=0;
        while (max-min>0.0000000001){
            mid=(max+min)/2;
            if (mid*mid>2){
                max=mid;
            }else if (mid*mid<2){
                min=mid;
            }else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println(mid);
    }
}
