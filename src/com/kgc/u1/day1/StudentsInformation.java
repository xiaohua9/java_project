package com.kgc.u1.day1;
import java.util.Scanner;

public class StudentsInformation {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("你要输入几个学生的信息：");
        int studentsNumber = sc.nextInt();
        System.out.println("再次确认，你将输入"+ studentsNumber+"个学生的信息");

        String[] num= new String[studentsNumber];
        String[] name=new String[studentsNumber];
        String[] gender= new String[studentsNumber];
        int[] age = new int[studentsNumber];

        for(int i =0; i<studentsNumber; i++){
            System.out.println("请输入学号");
            num[i] = sc.next();
            System.out.println("请输入姓名");
            name[i]=sc.next();
            System.out.println("请输入性别");
            gender[i]=sc.next();
            System.out.println("请输入年龄");
            age[i]= sc.nextInt();
        }
        System.out.println("学号-姓名-性别-年龄");
        for(int j =0; j<studentsNumber ; j++){
            System.out.println(num[j]+"-"+name[j]+"-"+ gender[j]+"-"+age[j]+'\n');

        }
    }

}

