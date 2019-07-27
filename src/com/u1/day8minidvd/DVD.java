package com.u1.day8minidvd;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

//这是一个DVD的实体类
public class DVD implements Serializable {
     private String dvdName;  //DVD信息的名称
     private String dvdStatus;//是否可借的状态
     private String dvdDate;  //借出日期
     private long dateCalc;   //由于计算天数间隔的需要，故加此属性,存储距离1970-1-1的毫秒数
     private int dvdTimes;    //借出次数
     private static Scanner input=new Scanner(System.in);//定义一个私有的类扫描器

    public DVD() { }
    //为了在判断是否存在DVD的时候，简单建立一个带名字的DVD进行匹配
    public DVD(String dvdName) {
        this.dvdName = dvdName;
    }

    public String getDvdName() {
        return dvdName;
    }
    public void setDvdName() {
        System.out.print("请输入DVD名称：");
        this.dvdName = "《"+input.next()+"》";
    }

    public String getDvdStatus() {
        return dvdStatus;
    }

    public void setDvdStatus() {
        this.dvdStatus = "可借";
    }
    public void setDvdStatus(int i) {
        this.dvdStatus = "已借";
    }

    public String getDvdDate() {
        return dvdDate;
    }

    public void setDvdDate(int i) {
        this.dvdDate="无";
    }

    public void setDvdDate() {
        this.dateCalc=new Date().getTime();//将用于计算的日期毫秒数存入变量
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");//为日期定制格式
        this.dvdDate=simpleDateFormat.format(this.dateCalc);//将指定格式的字符串日期存入变量
        /*System.out.println("请依次输入借出日期的年、月、日：");
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
        this.dvdDate =year+"-"+month+"-"+day;*/
    }

    public int getDvdTimes() {
        return dvdTimes;
    }

    public void setDvdTimes() {
        this.dvdTimes +=1 ;
    }
    public long getDateCalc() {
        return dateCalc;
    }

    @Override//重写equals方法，名字相同就相等
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DVD dvd = (DVD) o;
        return Objects.equals(dvdName, dvd.dvdName);
    }
}
