package com.u1.day8minidvd;
//这是DVD管理系统的控制中心
import java.util.Scanner;
public class Command {
    public static void main(String[] args) {
        DVDUtil xiaohua=new DVDUtil();
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎使用迷你DVD管理系统");
        xiaohua.createFile();//读之前判断文件是否存在，不存在新建，存在不建文件
        xiaohua.read();//读取文件数据
        String conmand="0";//控制程序循环执行的变量，为0时就返回菜单选择
        do {
            xiaohua.headPage();//调用首页方法
            String number = input.next();
            switch (number) {
                case "1":
                    xiaohua.insert();//新增方法
                    break;
                case "2":
                    xiaohua.select();//查询方法
                    break;
                case "3":
                    xiaohua.delete();//删除方法
                    break;
                case "4":
                    xiaohua.lend();//借出方法
                    break;
                case "5":
                    xiaohua.back();//归还方法
                    break;
                case "6":
                    System.out.println("谢谢使用！");
                    xiaohua.write();//退出之前把数据写入文件
                    System.exit(0);
                default:
                    System.out.println("输入错误，请返回后输入已有功能的编号");
            }
            System.out.println("*************************************************");
            do {
                System.out.println("输入0返回菜单选择");//输入不为0时就错误，要求用户一直输入
                conmand=input.next();
            }while (!"0".equals(conmand));
        }while ("0".equals(conmand));
    }
}
