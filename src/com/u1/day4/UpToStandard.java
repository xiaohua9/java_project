package com.u1.day4;
//学习任务如果不合格，每天的学习任务为：
// 上午阅读教材，学习理论部分，下午上机编程，掌握代码部分，如果合格完成学习任务
// 程序退出
import java.util.Scanner;

public class UpToStandard {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String upToStandard="n";
        while ("n".equals(upToStandard)){
            do {      //强行要求只能输入y/n
                System.out.print("合格了吗？（y/n）：");
                upToStandard=input.next();
            }while(!"y".equals(upToStandard) && !"n".equals(upToStandard));


            if ("y".equals(upToStandard)){
                System.out.println("完成学习任务！");
                break;
            }else {
                System.out.println("上午阅读教材\n下午上机编程！");
            }
        }
    }
}
