package com.u1.day1;

/*
  程序功能：根据学号查询学生的排名及所有信息
  思路：先输入学生的基本信息，再根据学生的成绩排序，最后根据接收的学号反馈相应的排名
 */

import java.util.Scanner;
public class StudentRankSearch {
    public static void main(String[] args){
        System.out.println("请问你要输入几个学生的信息？");
        Scanner sc1 = new Scanner(System.in); //创建键盘输入扫描器对象
        int many  = sc1.nextInt();
        System.out.println("-----提-------示------" + '\n'+"你将需要输入"+ many + "个学生信息");


        int[] num = new int[many];
        String[] name= new String[many]; //三个储存学生信息的变量
        int[] score = new int[many];

        for(int i =0;i< many ;i++){ //循环键入指定个数的学生信息
            System.out.println("请输入学号（提示：学号规则是年份加序号，比如19年1号为1901）");
            num[i] = sc1.nextInt();
            System.out.println("请输入姓名");
            name[i]=sc1.next();
            System.out.println("请输入分数");
            score[i]= sc1.nextInt();
        }
        System.out.println("输入完毕,以下是你输入的全部信息");
        System.out.println("学号-姓名-分数");
        for(int j =0; j<many ; j++){
            System.out.println(num[j]+"-"+name[j]+"-"+score[j]+'\n');
        }

        order(num,name,score);//调用封装好的排序函数
        String com="y";
        while ( com.equals("y") || com.equals("Y")){     //一直输0一直查询
            System.out.println("请输入你要查询的学号（提示：学号规则是年份加序号，如19年1号为1901）");
            int xuehao = sc1.nextInt();
            int index = search(num,xuehao);
            System.out.println("你查询学号的基本信息及排名如下：");
            System.out.println("学号-姓名-分数-排名");
            System.out.println(num[index]+"-"+name[index]+"-"+score[index]+"-"+ (index+1));
            System.out.println("继续查询请输y或Y，退出请输任意字母");
            com =sc1.next();
        }
        System.out.println("-------------再----会--------------");
    }
    /*
       以下函数实现了根据分数的排序功能，并且其它的信息也随着联动
     */
    static void order(int[] num , String[] name , int[] score){
        for( int i = 0; i<score.length-1;i++){
            for(int j = i+1; j<score.length;j++){
                if(score[i]<score[j]){
                    int temp1 = score[i];
                    score[i]=score[j];/////////分数的排序操作
                    score[j]=temp1;

                    temp1 = num[i];
                    num[i] =num[j]; /////学号跟随分数对应变动
                    num[j]=temp1;

                    String temp2 = name[i];
                    name[i]=name[j];////姓名跟随分数对应变动
                    name[j]= temp2;
                }
            }
        }
    }
    static int search(int [] num , int  xuehao){
        int max =num.length-1;//一位最大的索引要比元素个数小1
        int min = 0;
        while (min<=max){ //一直夹闭到最大索引和最小索引重合，重合时也是运算量最大的时候
            int mid = (max + min)/2;
            if(num[mid]<xuehao){
                min=mid+1;
            }else if(num[mid]>xuehao){
                max=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

