package com.u3.day20later;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//获取网页图片的工具类
public class GetPictureUtils {
    private static List<String> list=new ArrayList<String>();//存储图片地址的仓库
    //获取图片地址的方法
    public static void getURL(){
        for (int i=1;i<=8;i++) {//获取5页图片
            try {
                URL url = new URL("http://www.umei.cc/meinvtupian/"+i+".htm");//动态网页地址
                //构造输入流
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
                //构造正则表达式
                Pattern pattern = Pattern.compile("http://i1.whymtj.com/uploads/tu/\\d{6}/\\d{1,6}/\\w{1,10}\\.jpg");
                Matcher matcher;
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    matcher = pattern.matcher(s);
                    while (matcher.find()) {
                        list.add(matcher.group());
                    }
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //在界面输出获取的网址
        System.out.println("------获取资源------");
    }
    //下载美图
    public static void download(){
        Iterator<String> iterable=list.iterator();//获取地址的迭代器
        int pictureOrder=1;//图片取名时的序号
        try {
            while (iterable.hasNext()){
                String tmpURL=iterable.next();
                //开始下载操作
                DataInputStream dataInputStream=new DataInputStream(new URL(tmpURL).openStream());//获取该图片的读取流
                DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("D:\\beidabirdschool\\girls\\"+(pictureOrder++)+"号爱妃.jpg"));
                byte[] b=new byte[100];//每次写100个字节
                int len=0;//记录读入数组的字节数
                while ((len=dataInputStream.read(b))>0){
                    dataOutputStream.write(b,0,len);
                    dataOutputStream.flush();//清空缓存
                }
                dataOutputStream.close();//关流
                dataInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("------下载完毕------");
    }

    public static void main(String[] args) {
        getURL();//获取资源
        download();//下载资源
    }
}
