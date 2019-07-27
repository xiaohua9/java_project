package com.u2.day16.ageexception;
import java.util.Scanner;
public class InputAge {
    public static void main(String[] args) {
        System.out.print("请输入年龄：");
        Scanner input=new Scanner(System.in);
        int age =input.nextInt();
        if (age<0||age>100){
            try {
                throw new ErrorAgeException();
            } catch (ErrorAgeException e) {
                e.printStackTrace();
            }
        }
    }
}
