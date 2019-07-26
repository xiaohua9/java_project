package com.kgc.u2.day15aftersupermarketsystem;
import java.util.Scanner;
public class VIPController {
    public static void main(String[] args) {
        VipUtil vipUtil=new VipUtil();//创建一个管理工具
        Scanner input=new Scanner(System.in);//定义一个扫描器

        String choose;//储存功能选择编号
        do {
            vipUtil.headPage();//调出首页
            choose=input.next();
            switch (choose){
                case "1":
                    vipUtil.addRewardPoints();//积分累计
                    break;
                case "2":
                    vipUtil.changeRewardPoint();//积分兑换
                    break;
                case "3":
                    vipUtil.selectRewardPoints();//查看积分
                    break;
                case "4":
                    vipUtil.changePassword();//修改密码
                    break;
                case "5":
                    vipUtil.getCount();//开会员
                    break;
                case "6":
                    System.out.println("谢谢使用！");
                    System.exit(0);
                    default:
                        System.out.println("输入错误！");
            }
        }while (true);

    }
}
