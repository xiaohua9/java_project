
/*龙小华
2019-7-1
今天的所有作业全部以方法的方式，然后调用方法实现*/
package com.kgc.u1.day6;
import java.util.Scanner;

public class AllTask {
    static Scanner input=new Scanner(System.in);//建立一个公有输入扫描器
    public static void main(String[] args) {
        FiveScore();//循环输入5名员学姓名和成绩，求出成绩最高的学员姓名和成绩,查找”张三”这名学员的成绩(定义两个数组)
        changeName();//改名
        System.out.print("你想建立存储几个数的数组：");
        int number=input.nextInt();
        inputOut(number);//输入数组数据数据，输出数组数据
    }

    //以下方法实现：循环输入5名员学姓名和成绩，求出成绩最高的学员姓名和成绩,查找”张三”这名学员的成绩(定义两个数组)
    public static void FiveScore(){
        String[] name=new String[5];
        int[] score=new int[5];

        //以下循环输入五名学院的姓名和成绩
        System.out.println("请输入5个姓名和对应的成绩");
        for (int i=0;i<name.length;i++){
            System.out.print("请输入第"+(i+1)+"个学员的姓名：");
            name[i]=input.next();
            System.out.print("请输入第"+(i+1)+"个学员的成绩：");
            score[i]=input.nextInt();
        }
        //以下实现最高成绩及对应姓名的输出
        int temp=score[0];
        int index=0;
        for (int i=1;i<score.length;i++){
            if (temp<score[i]){
                temp=score[i];
                index=i;
            }
        }
        System.out.println("最高成绩是"+name[index]+"的"+score[index]);
        //以下实现根据姓名查找成绩的功能
        System.out.print("请输入你要查询的姓名：");
        String searchName=input.next();
        int searchNameIndex=exitName(name,searchName);
        if (searchNameIndex==-1){
            System.out.println("你查询的姓名不存在");
        }else {
            System.out.println(name[searchNameIndex]+"的成绩是："+score[searchNameIndex]);
        }
    }

   /* 以下方法实现：
         定义一个数组来保存10个学员的姓名
	        3.1)接受用户输入一个姓名，判断这个姓名是否在数组，如果在返回这个姓名的索引号，不在返回-1
            3.2)支持改名的功能，输入一个索引和新的姓名，将这个索引的姓名更解
                                输入一个老姓名，在数组中查找将老姓名改成新姓名
         每功能完成，输出数组中的数据。
    */
   public static void changeName(){
       String[] name={"龙一","龙二","龙三","龙四","龙五","龙六","龙七","龙八","龙九","龙十"};
       System.out.println("更改前的数据");
       for (int i=0;i<name.length;i++){
           System.out.print(name[i]+"\t");
       }
       System.out.println();

       //以下实现根据索引改名功能
       int changeIndex;
       do {
           System.out.print("请输入更改姓名的索引号0-9：");
           changeIndex=input.nextInt();
       }while (changeIndex<0||changeIndex>name.length-1);
       System.out.print("请输入新姓名：");
       String changeName=input.next();
       name[changeIndex]=changeName;

       System.out.println("根据索引改名后的数据");
       for (int i=0;i<name.length;i++){
           System.out.print(name[i]+"\t");
       }
       System.out.println();

       //以下实现根据姓名改名功能
       System.out.print("请输入一个姓名：");
       String searchName=input.next();
       int searchIndex=exitName(name,searchName);
       if (searchIndex==-1){
           System.out.println("你输入的名字不存在");
       }else {
           System.out.print("请输入一个新姓名：");
           name[searchIndex]=input.next();

           System.out.println("根据姓名改名后的数据");
           for (int i=0;i<name.length;i++){
               System.out.print(name[i]+"\t");
           }
           System.out.println();
       }
   }
   //以下方法是changeName的辅组方法，
   // 功能：接受用户输入一个姓名，判断这个姓名是否在数组，如果在返回这个姓名的索引号，不在返回-1
   public static int exitName(String[] name,String searchName){
       int searchIndex;//用于储存查询姓名的索引
       for (searchIndex=0;searchIndex<name.length && !searchName.equals(name[searchIndex]);searchIndex++){ }//根据短路原则，必须优先判断长度
       //出for时，如果数组最后一个值不等于输入的姓名，那么该姓名不存在，否则searchIndex就是该姓名的下标
       if (searchIndex<=name.length-1){
           return searchIndex;
       } else {
           return -1;
       }
   }


    //该方法接受一个数n，然后建立一个长度为n的int数组，并循环赋值，再输出
    public static void inputOut(int number){
       int[] arr=new int[number];
       for (int i=0;i<arr.length;i++){//循环记录数据
           System.out.print("请输入第"+(i+1)+"个数：");
           arr[i]=input.nextInt();
       }
       for (int i=0;i<arr.length;i++){//循环输出数据
           System.out.println("第"+(i+1)+"个数是："+arr[i]);
       }
    }
}
