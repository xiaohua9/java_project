package com.u1.day4;
import java.util.Scanner;
//根据用户输入数，指定打印次数
public class PrintTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您要打印的试卷数量：");
        int number=input.nextInt();
        int calc=1;
        while (calc<=number){
            System.out.println("打印第"+calc+"份试卷");
            calc++;
        }
    }
}
