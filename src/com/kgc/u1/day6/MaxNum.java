
//输出数组的最大值和最大值原本的下标值
package com.kgc.u1.day6;

public class MaxNum {
    public static void main(String[] args) {
        int[] number={1,3,4,6,8,9,7};
        int index=0;
        for (int i=1;i<number.length;i++){
            if(number[0]<number[i]) {
                number[0] = number[i];
                index=i;
            }
        }
        System.out.println("数组的最大值："+number[0]);
        System.out.println("交换之前最大值的下标："+index);
    }
}
