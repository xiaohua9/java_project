package com.kgc.u2.day15aftersupermarketsystem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

//为会员数据操作提供功能的类
public class VipUtil {
    private ArrayList<VIP> list=new ArrayList<VIP>();//会员信息储存仓库
    private static final Scanner input=new Scanner(System.in);//定义一个私有的类扫描器
    //显示首页的方法
    public void headPage(){
        System.out.println("----------------欢迎使用超市会员管理系统-------------------------");
        System.out.println("1.积分累计\n2.积分兑换\n3.查询剩余积分\n4.修改密码\n5.开卡\n6.退出系统");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("请选择：");
    }
    //开卡
    public void getCount(){
        VIP vip=new VIP();//创建一个VIP对象
        System.out.print("请输入姓名：");//姓名
        vip.setName(input.next());
        System.out.print("请输入密码：");//密码及判断
        String tmpPassword;
        do {
            tmpPassword = input.next();
            if (tmpPassword.length() < 6) {
                try {
                    throw new MissMatchPasswordLawException();
                } catch (MissMatchPasswordLawException e) {
                    System.out.print("请重新输入密码：");
                }
            }
        }while (tmpPassword.length()<6);
        vip.setPassword(tmpPassword);//存入密码
        Date date=new Date();//获取当前日期
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");//定制格式
        vip.setCardBirthday(format.format(date));//存入日期
        Random random=new Random();
        String tmpCount=1000000+random.nextInt(1000000)+"";
        vip.setCount(tmpCount);//存入账号
        list.add(vip);//将VIP加入会员管理仓库，完成开卡
        System.out.println("恭喜开通会员成功，赠送您100积分，您的卡号为："+tmpCount);
    }
    //账号密码验真
    public VIP check(){
        System.out.print("请输入会员卡号：");
        String tmpCount=input.next();
        System.out.print("请输入密码：");
        String tmpPassword=input.next();
        VIP tmpVIP=new VIP();//建立临时账户，作为比对参照
        tmpVIP.setCount(tmpCount);
        tmpVIP.setPassword(tmpPassword);
        if (list.contains(tmpVIP)){
            return list.get(list.indexOf(tmpVIP));//通过临时账户获取会员库真实账户
        }else {
            System.out.println("卡号或密码错误");
            return null;
        }
    }
    //积分累计
    public void addRewardPoints(){
        VIP tmpVIP=check();
        if (tmpVIP!=null){
            System.out.print("请输入此次消费金额（1元1积分）：");
            tmpVIP.setRewardPoints(tmpVIP.getRewardPoints()+input.nextInt());
            System.out.println("积分累计成功！");
        }
    }
    //兑换积分
    public void changeRewardPoint(){
        VIP tmpVIP=check();
        if (tmpVIP!=null){
             int tmpRewardPoints;//需要兑换的积分额
            do {
                System.out.print("请输入需要兑换的积分额（100积分抵用1元，不足100不作抵用）：");
                tmpRewardPoints=(int)input.nextDouble();
            }while (tmpRewardPoints>tmpVIP.getRewardPoints());
            System.out.println("您的消费额中使用会员积分抵消"+((tmpRewardPoints/100)*1)+"元");
            tmpVIP.setRewardPoints(tmpVIP.getRewardPoints()-tmpRewardPoints/100*100);//在会员库中修改积分
            System.out.println("积分兑换成功！");
        }
    }
    //查询剩余积分
    public void selectRewardPoints(){
        VIP tmpVIP=check();
        if (tmpVIP!=null){
            System.out.println("姓    名："+tmpVIP.getName()+"\n"+
                               "卡    号："+tmpVIP.getCount()+"\n"+
                               "开卡日期："+tmpVIP.getCardBirthday()+"\n"+
                               "剩余积分："+tmpVIP.getRewardPoints()+"\n");
        }
    }
    //修改密码
    public void changePassword(){
        VIP tmpVIP=check();
        if (tmpVIP!=null){
            String tmpPassword;
            System.out.print("请输入新密码：");
            do {
                tmpPassword = input.next();
                if (tmpPassword.length() < 6) {
                    try {
                        throw new MissMatchPasswordLawException();
                    } catch (MissMatchPasswordLawException e) {
                        System.out.print("请重新输入密码：");
                    }
                }
            }while (tmpPassword.length()<6);
            tmpVIP.setPassword(tmpPassword);
            System.out.println("密码修改成功！");
        }
    }

}
