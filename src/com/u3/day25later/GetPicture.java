
/*
 * UDP协议通信练习
 * 本文件作为图片接收端
 * */
package com.u3.day25later;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class GetPicture {
    public static void main(String[] args) throws Exception{
        DatagramSocket getSocket=new DatagramSocket(8989);//构建接收端socket
        byte[] bytes=new byte[100000];//构建一个足够大的接收容器
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length);//将接收容器打包
        getSocket.receive(datagramPacket);//监听接收数据包
        File file =new File("C:\\Users\\Administrator\\Desktop\\传来的1号爱妃.jpg");//图片接收地址
        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream(file));//构造图片输出流
        dataOutputStream.write(datagramPacket.getData());//提取包中数据并输出
        dataOutputStream.close();//关流
    }
}
