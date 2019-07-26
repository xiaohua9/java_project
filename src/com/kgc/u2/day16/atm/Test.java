package com.kgc.u2.day16.atm;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Scanner input=new Scanner(System.in);
        String choose;//储存功能选择编号
        do {
            atm.headPage();//调出首页
            choose=input.next();
            switch (choose){
                case "1":
                    atm.deposit();//存款
                    break;
                case "2":
                    atm.withDraw();//取款
                    break;
                case "3":
                    atm.showBalance();//显示余额
                    break;
                case "4":
                    System.out.println("谢谢使用！");
                    System.exit(0);
                default:
                    System.out.println("输入错误！");
            }
        }while (true);

    }
}
