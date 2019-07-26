package com.kgc.u1.day8minidvd;
import java.io.*;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
//这是一个DVD的工具类
public class DVDUtil {
    private LinkedList<DVD> list=new LinkedList<DVD>();//构造一个DVD的储存仓库
    private static Scanner input=new Scanner(System.in);//定义一个私有的类扫描器

    //显示首页的方法
    public void headPage(){
        System.out.println("------------------------------------");
        System.out.println("1.新增DVD\n2.查看DVD\n3.删除DVD\n4.借出DVD\n5.归还DVD\n6.退出系统");
        System.out.println("------------------------------------------");
        System.out.println("请选择：");
    }
    //新增方法
    public void insert(){
        //此时的dvdNumber正好是紧接最后一个DVD信息的下标，将信息添加在该下标中即可
        System.out.println("-->新增DVD");
        DVD dvd=new DVD();//创建一个DVD对象
        dvd.setDvdName();//提交名字
        dvd.setDvdStatus();//提交可借状态
        dvd.setDvdDate(1);//借出日期无
        list.add(dvd);//把该DVD存在DVD仓库里去
        System.out.println("新增"+dvd.getDvdName()+"成功！当前共有"+list.size()+"个DVD");

    }
    //查看方法
    public void select(){
        System.out.println("-->查看DVD");
        if (list.isEmpty()){
            System.out.println("当前系统中没有DVD");
        }else {
            Iterator<DVD> itor=list.iterator();
            System.out.println("\t名字\t\t是否可借\t借出日期\t借出次数");
            while (itor.hasNext()){
                DVD dvd=itor.next();
                System.out.println(dvd.getDvdName()+"\t"+dvd.getDvdStatus() +"\t\t"+dvd.getDvdDate() +"\t\t\t"+dvd.getDvdTimes());
            }
        }
    }
    //删除方法
    public void delete(){
        System.out.println("-->删除DVD");
        System.out.println("请输入要删除的DVD名字");
        String name="《"+input.next()+"》";
        DVD tmpDvd=new DVD(name);
        if (!list.contains(tmpDvd)){//判断DVD是否存在
            System.out.println("无法删除不存在的DVD");
        }else {
            tmpDvd=list.get(list.indexOf(tmpDvd));
            if ("借出".equals(tmpDvd.getDvdStatus())){
                System.out.println("无法删除借出状态的DVD");
            }else {
                //以上排除了输入错误和借出两种情况，以下正式开始实现删除
                list.remove(tmpDvd);
                System.out.println("删除成功");
            }
        }
    }
    //借出方法
    public void lend() {
        System.out.println("-->借出DVD");
        System.out.println("借出业务说明：从借出日开始算，每天一元");
        System.out.println("请输入要借出的DVD名字");
        String name = "《" + input.next() + "》";
        DVD tmpDvd=new DVD(name);
        if (!list.contains(tmpDvd)){//判断DVD是否存在
            System.out.println("无法借出不存在的DVD");
        }else {
            tmpDvd=list.get(list.indexOf(tmpDvd));
            if ("已借".equals(tmpDvd.getDvdStatus())){
                System.out.println("无法借出已借出的DVD");
            }else {
                //  以上排除了输入错误和借出两种情况，以下正式开始实现借出业务
                tmpDvd.setDvdStatus(1);
                tmpDvd.setDvdTimes();
                tmpDvd.setDvdDate();
            }
        }
    }
    //归还方法
    public void back() {
        System.out.println("-->归还DVD");
        System.out.println("请输入要归还的DVD名字");
        String name = "《" + input.next() + "》";
        DVD tmpDvd=new DVD(name);
        if (!list.contains(tmpDvd)){//判断DVD是否存在
            System.out.println("无法归还不存在的DVD");
        }else {
            tmpDvd=list.get(list.indexOf(tmpDvd));
            if ("可借".equals(tmpDvd.getDvdStatus())){
                System.out.println("无法归还未借出的DVD");
            }else {
                //  以上排除了输入错误和未借出两种情况，以下正式开始实现归还业务
                System.out.println("您于"+tmpDvd.getDvdDate()+"借此DVD");
                Date tmpdate=new Date();//获取当前日期，用于计算天数间隔
                //以下计算出借出天数
                int daycount=(int)(tmpdate.getTime()/(24*3600*1000))-(int)(tmpDvd.getDateCalc()/(24*3600*1000))+1;
                System.out.println("您需要支付"+daycount+"元");
                tmpDvd.setDvdStatus();//改为可借
                tmpDvd.setDvdDate(1);//日期改为无

                /*-----------------------------------------------------------------------
                //归还日必须是1-31的整数，否则重输
                String[] temp=tmpDvd.getDvdDate().split("-");
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
                tmpDvd.setDvdStatus();//改为可借
                tmpDvd.setDvdDate(1);//日期改为无*/
            }
        }
    }
    //新建文件----------先判断文件是否存在，如果不存在就新建一个，如果存在就不建立了
    public void createFile(){
        File file=new File("DVDinformation.txt");//指向当前路径下的该文件
        if (!file.exists()){
            try {
                file.createNewFile();//如果文件不存在，新建一个文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //文件写入
    public void write(){
        FileOutputStream fos=null;//声明字节输出流
        ObjectOutputStream oos=null;//声明对象输出流
        try {
            fos=new FileOutputStream("DVDinformation.txt");
            oos=new ObjectOutputStream(fos);//序列化器构造完成
            Iterator<DVD> iterator=list.iterator();//集合迭代器
            while (iterator.hasNext()){
                oos.writeObject(iterator.next());//把集合中的数据全部序列化写进文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {      //关闭流
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //文件读取
    public void read(){
        FileInputStream fis=null;//声明字节输入流
        ObjectInputStream ois=null;//声明对象输入流
        try {
            fis=new FileInputStream("DVDinformation.txt");
            ois=new ObjectInputStream(fis);//反序列化器构造完成
            DVD tmpDVD=null;
            while ((tmpDVD=(DVD)ois.readObject())!=null){
                list.add(tmpDVD);//将文件的对象数据读出并存入集合
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException e){

        }finally {//关闭流
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (NullPointerException e){
                //这个空指针异常是被我允许的，因为系统第一次运行，文件系统还没有信息，自然是空，以后就不会了
                //而且我允许了这个异常之后不仅数据无影响，程序也可以正常运行，
            }
        }
    }

}
