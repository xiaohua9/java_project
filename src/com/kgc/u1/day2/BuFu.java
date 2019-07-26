package com.kgc.u1.day2;
public class BuFu {
    public static void main(String[] args) {

        /*解释下面三行执行情况：
          第一个i++结束后到第二个i++时，第一个i++就加1了，
          以此类推，最后相当于时3+4+5赋值给count。
          经验是：i++是在遇到下一个运算时执行
         */
        int i=3;
        int count =(i++)+(i++)+(i++);
        System.out.println("count="+count);

        int num1 = 0;
        for (i = 0; i < 99; i++) {
            num1=num1++;
        }
        System.out.println("num1="+num1);

        int num2= 0;
        for ( i = 0; i < 99; i++) {
            num2 = ++num2;
        }
        System.out.println("num2="+num2);


        num1 = 0;
        num2 = 0;
        for ( i = 0; i < 2; i++) {
            num1 = num1 ++;
            num2 = num1 ++;
        }
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);


        num1=1;
        num2=2;
        boolean boo=num1>0&&num1++>=num2;///先比较，比较完了才自增
        System.out.println(boo);

        int x=0;
        x--;
        int y=x++ + ++x;//-1+1;到++i时，前一个i++完成自增
        System.out.println(x+y+ ++x);


    }
}
