package com.kgc.u1.day3;
import java.util.Scanner;
/*
正确使用多重if选择结构，实现根据存款和购买能力的对应关系
（当存款大于等于500万时买“凯迪拉克”，当存款大于等于100万时买“帕萨特”，
当存款大于等于50万时买“伊兰特”，当存款大于等于10万时买“奥拓”，否则只能买“捷安特”）
输出与之对应可以购买的车型，当存款为52万时输出如图所示的效果。
（使用多重if选择语句处理问题时需要注意顺序）
 */
public class Shopping {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入您的存款：");
        double money=input.nextDouble();

        if (money>=500){
            System.out.println("我可以买辆卡迪拉克");
        }else if (money>=100){
            System.out.println("我可以买辆帕萨特");
        }else if (money>=50){
            System.out.println("我可以买辆依兰特");
        }else if (money>=10){
            System.out.println("我可以买辆奥拓");
        }else {
            System.out.println("我可以买辆捷安特");
        }
    }
}
