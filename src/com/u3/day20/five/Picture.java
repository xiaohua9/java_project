package com.u3.day20.five;

import java.io.*;
import java.net.URL;

public class Picture {
    public static void main(String[] args) throws Exception{
        URL url=new URL("http://b-ssl.duitang.com/uploads/blog/201408/15/20140815112110_x4Z3x.jpeg");
        InputStream inputStream = url.openStream();//打开一个网址的输入流
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\aa.jpg"));
        byte[] b=new byte[100];
        int len=0;
        while ((len=dataInputStream.read(b))>0){
            dataOutputStream.write(b,0,len);
        }
        dataOutputStream.flush();
        dataOutputStream.close();
        dataInputStream.close();
        System.out.println("读取完毕");
    }
}
