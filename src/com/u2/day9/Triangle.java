package com.u2.day9;
import java.util.Arrays;
import java.util.Scanner;

//三角形类,三角形的三边必须满足任意两边之和大于第三边
public class Triangle {
    //三个边属性
    int side1;
    int side2;
    int side3;
    static Scanner input=new Scanner(System.in);
    //重载构造方法，因为三边必须满足判定定理
    public Triangle(){
        System.out.println("-->我是三角形构造达人");
        int[] sides=new int[3];
        do {
            System.out.print("请输入第一条边：");
            sides[0]=input.nextInt();
            System.out.print("请输入第二条边：");
            sides[1]=input.nextInt();
            System.out.print("请输入第三条边：");
            sides[2]=input.nextInt();
            Arrays.sort(sides);
            if (sides[0]+sides[1]>sides[2]){
                this.side1 = sides[0];
                this.side2 = sides[1];
                this.side3 = sides[2];
                this.length();//如果构建成功，就调用周长方法输出周长
            }else {
                System.out.println("你输入的三边不能构成三角形，请重新构造对象");
            }
        }while (this.side1==0);

    }

    /////计算周长的方法
    public void length(){
        int length=this.side1+this.side2+this.side3;
        System.out.println("三角形的周长为："+length);
    }
}
