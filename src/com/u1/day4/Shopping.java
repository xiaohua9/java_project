package com.u1.day4;
//根据“是否继续”和“商品编号”两个条件，反复查询所选商品的价格
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        System.out.println("*******************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
        System.out.println("*******************************************");

        Scanner input = new Scanner(System.in);

        String begain = "y";
        while ("y".equals(begain)) {
            System.out.print("请输入商品编号：");
            int goodNumber = input.nextInt();
            switch (goodNumber) {
                case 1:
                    System.out.println("T恤\t￥100");
                    break;
                case 2:
                    System.out.println("网球鞋\t￥90");
                    break;
                case 3:
                    System.out.println("网球拍\t￥110");
                    break;
                default:
                    System.out.println("商品编号输入错误");
            }

            do {//强行要求输入y/n
                System.out.print("是否继续（y/n）");
                begain=input.next();
            }while (!"y".equals(begain)&&!"n".equals(begain));
        }
    }
}
