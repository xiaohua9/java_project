/*
-------------------------------------------------------------------------------------

为某音像店开发一个迷你DVD管理器，实现DVD碟片的管理功能。
功能具体包括：新增、查看、删除、借出、归还和退出。
--------------------------------------------------------------------------------------
                      龙小华
                   2019-6-29（V1.0）
                 经调试，所有功能基本实现
--------------------------------------------------------------------------------------

                      龙小华
                   2019-6-30（V2.0）
   1.0版本在输入菜单选择和返回时，存在输入数据类型不匹配的异常风险，致使程序很不稳定。
2.0版本针对此问题做了升级，将控制菜单循环选择的变量和控制返回主菜单的变量改为字符串类型，
有效地规避了1.0版本存在的风险，增强了系统的健壮性
---------------------------------------------------------------------------------------
*/

package com.u1.day8minidvd;
import java.util.Scanner;

public class MiniDVD {

    static String[] dvdName=new String[10];  //DVD信息的名称数组
    static String[] dvdStatus=new String[10];//是否可借的状态数组
    static String[] dvdDate=new String[10];  //借出日期数组
    static int[] dvdTimes=new int[10];       //借出次数数组

    static Scanner input=new Scanner(System.in);//定义一个静态公用输入扫描器

/*  主方法调用各个方法，控制整个流程，首先进入主菜单进行选择，外层循环实现循环选择，
    内层循环要求用户必须输入0才能换回主菜单，然后选择是继续还是退出*/
    public static void main(String[] args) {
        System.out.println("欢迎使用迷你DVD管理系统");
        String conmand="0";//控制程序循环执行的变量，为0时就返回菜单选择
        do {
            headPage();//调用首页方法
            String num = input.next();
            switch (num) {
                case "1":
                    insert();//调用新增方法
                    break;
                case "2":
                    select();//调用查询方法
                    break;
                case "3":
                    delete();//调用删除方法
                    break;
                case "4":
                    lend();//调用借出方法
                    break;
                case "5":
                    back();//调用归还方法
                    break;
                case "6":
                    System.out.println("谢谢使用！");
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
    //首页方法，构造首页菜单界面，引导用户选择
    public static void headPage(){
        System.out.println("------------------------------------");
        System.out.println("1.新增DVD\n2.查看DVD\n3.删除DVD\n4.借出DVD\n5.归还DVD\n6.退出系统");
        System.out.println("------------------------------------------");
        System.out.println("请选择：");
    }
    //新增方法
    public static void insert(){
        int memberNumber=0;
        for (;dvdName[memberNumber]!=null;memberNumber++){ }  // for循环得出当前DVD数量，存入memberNumber
        if (memberNumber>=6){        //判断DVD数量是否超过六个，如果超过六个，提示货架已满，不能储存了
            System.out.println("货架已满，不能存了");
        }else {        //此时的memberNumber正好是紧接最后一个DVD信息的下标，将信息添加在该下标中即可
            System.out.println("-->新增DVD");
            System.out.println("请输入DVD名称");
            dvdName[memberNumber]="《"+input.next()+"》";
            dvdStatus[memberNumber]="可借";
            dvdDate[memberNumber]="无";
            System.out.println("新增"+dvdName[memberNumber]+"成功！");
        }
    }
    //查看方法
    public static void select(){
        System.out.println("-->查看DVD");
        System.out.println("\t名字\t\t是否可借\t借出日期\t借出次数");
        int i;
        for (i=0;dvdName[i]!=null;i++){    //显示所有系统中的DVD信息
            System.out.println(dvdName[i]+"\t"+dvdStatus[i]+"\t\t"+dvdDate[i]+"\t\t\t\t"+dvdTimes[i]);
        }
        if (i==0){  //如果当前系统中没有DVD，则提示当前系统中没有DVD
            System.out.println("当前系统中没有DVD");
        }
    }
    //删除方法
    public static void delete(){
        System.out.println("-->删除DVD");
        System.out.println("请输入要删除的DVD名字");
        String name="《"+input.next()+"》";
        int exitStatus=0;  //DVD存在的状态码，0不存在，1存在
        for (int i=0;dvdName[i]!=null;i++){ //for循环判断DVD是否存在，如果存在，将状态码改为1
            if (name.equals(dvdName[i])){
                exitStatus=1;
                break;
            }
        }
        if (exitStatus==0){
            System.out.println("无法删除不存在的DVD");
        }else {
            int i;
            for (i=0;!name.equals(dvdName[i]);i++){ }//寻找需要删除的DVD索引，结束时的i即是
            if ("借出".equals(dvdStatus[i])){
                System.out.println("无法删除借出状态的DVD");
            }else {
                //以上排除了输入错误和借出两种情况，以下正式开始实现删除
                int j;
                for (j=i;dvdName[j]!=null;j++){ }//寻找最后一个DVD的索引，j-1就是最后一个DVD的索引
                for (;i<j-1;i++){//将数据全部往前移一个步长位置
                    dvdName[i]=dvdName[i+1];
                    dvdStatus[i]=dvdStatus[i+1];
                    dvdDate[i]=dvdDate[i+1];
                    dvdTimes[i]=dvdTimes[i+1];
                }
                dvdName[j-1]=null;//前移后，初始化最后一项，即完成删除功能
                dvdStatus[j-1]=null;
                dvdDate[j-1]=null;
                dvdTimes[j-1]=0;

            }
        }



    }
    //借出方法
    public static void lend() {
        System.out.println("-->借出DVD");
        System.out.println("借出业务说明：收取DVD价值的1.5倍作押金，每天一块钱，月底必须归还，未归还者扣除全部押金，如若还想借者可再借，");
        System.out.println("请输入要借出的DVD名字");
        String name = "《" + input.next() + "》";
        int exitStatus = 0;  //DVD存在的状态码，0不存在，1存在
        for (int i = 0; dvdName[i] != null; i++) { //for循环判断DVD是否存在，如果存在，将状态码改为1
            if (name.equals(dvdName[i])) {
                exitStatus = 1;
                break;
            }
        }
        if (exitStatus == 0) {
            System.out.println("无法借出不存在的DVD");
        } else {
            int i;
            for (i = 0; !name.equals(dvdName[i]); i++) { }//寻找需要借出的DVD索引，结束时的i即是
            if ("借出".equals(dvdStatus[i])) {
                System.out.println("无法借出已借出的DVD");
            } else {
                //  以上排除了输入错误和借出两种情况，以下正式开始实现借出业务
                dvdStatus[i] = "借出";
                dvdTimes[i]+=1;
                System.out.println("请依次输入借出日期的年、月、日：");
                //年份必须大于等于2019，否则重输
                int year;
                do {
                    System.out.print("请输入借出日期的年：");
                    year=input.nextInt();
                }while (year<2019);
                //月份必须是1-12的整数，否则重输
                int month;
                do {
                    System.out.print("请输入借出日期的月：");
                    month = input.nextInt();
                }while (month!=1&&month!=2&&month!=3&&month!=4&&month!=5&&month!=6&&month!=7&&month!=8&&month!=9&&month!=10&&month!=11&&month!=12);
                //日必须是1-31的整数，否则重输
                int day;
                do {
                    System.out.print("请输入借出日期的日：");
                    day = input.nextInt();
                }while (day<1||day>31);
                dvdDate[i]=year+"-"+month+"-"+day;
            }
        }
    }
    //归还方法
    public static void back() {
        System.out.println("-->归还DVD");
        System.out.println("请输入要归还的DVD名字");
        String name = "《" + input.next() + "》";
        int exitStatus = 0;  //DVD存在的状态码，0不存在，1存在
        for (int i = 0; dvdName[i] != null; i++) { //for循环判断DVD是否存在，如果存在，将状态码改为1
            if (name.equals(dvdName[i])) {
                exitStatus = 1;
                break;
            }
        }
        if (exitStatus == 0) {
            System.out.println("无法归还不存在的DVD");
        } else {
            int i;
            for (i = 0; !name.equals(dvdName[i]); i++) { }//寻找需要归还的DVD索引，结束时的i即是
            if ("可借".equals(dvdStatus[i])) {
                System.out.println("无法归还未借出的DVD");
            } else {
                //  以上排除了输入错误和未借出两种情况，以下正式开始实现归还业务
                //归还日必须是1-31的整数，否则重输
                String[] temp=dvdDate[i].split("-");
                int lendDay=Integer.parseInt(temp[temp.length-1]);//本月借出日
                int backDay;//本月归还日
                do {
                    System.out.print("今天是几号：");
                    backDay = input.nextInt();

                } while (backDay< 1 || backDay > 31);
                if (backDay<lendDay){
                    System.out.println("您没有履行月底归还DVD的约定，将被扣除全部押金");
                }else {
                    System.out.println("您需要支付"+(backDay-lendDay+1)+"元租金");
                }
                dvdStatus[i]="可借";
                dvdDate[i]="无";
            }
        }
    }
}
