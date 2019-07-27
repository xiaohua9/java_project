
/*
* UDP协议通信练习
* 本文件作为图片发送端
* */
package com.u3.day25later;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendPicture {
    public static void main(String[] args) throws Exception{
        DatagramSocket sendSocket=new DatagramSocket(0);//构造发送端socket，0代表随机端口
        File file =new File("C:\\Users\\Administrator\\Desktop\\1号爱妃.jpg");//此地址的图片被发送
        int pictureSize = (int) file.length();//获取图片的字节数
        DataInputStream dataInputStream=new DataInputStream(new FileInputStream(file));//构造图片的读取流
        byte[] bytes=new byte[pictureSize];//图片数据的容器
        dataInputStream.read(bytes);//因为我已经知道图片数据大小，所以一次性且正好读完
        dataInputStream.close();//关流
        //打包
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length,InetAddress.getByName("localhost"), 8989);
        sendSocket.send(datagramPacket);//发包
    }
}
