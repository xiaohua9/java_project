package com.u3.day25.task1;

import java.io.*;
import java.net.Socket;

//客户端
public class Client {
    public static void main(String[] args) throws Exception{
        System.out.println("客户端开启.......");
        Socket socket=new Socket("localhost",5571);
        DataInputStream dataInputStream=null;//读取服务端
        DataOutputStream dataOutputStream =null;//向服务端输出
        DataInputStream in=null;//读取键盘输入

        boolean flag=true;
        while (flag) {
            try {
                dataInputStream = new DataInputStream(socket.getInputStream());
                dataOutputStream = new DataOutputStream(socket.getOutputStream());
                in = new DataInputStream(System.in);

                byte[] bytes=new byte[500];
                int len=0;
                System.out.print("我说：");
                while ((len=in.read(bytes))!=0){
                    if ("exit".equals(new String(bytes,0,len-1))){//如果输入exit，就退出，-1是除去换行符
                        flag=false;
                        break;
                    }
                    dataOutputStream.write(bytes,0,len);//把我说的话传给服务端
                    dataOutputStream.flush();
                    len=dataInputStream.read(bytes);//读取服务端的反馈
                    System.out.print("对方："+new String(bytes,0,len));
                    System.out.print("我说：");
                }
            } catch (Exception e) { }
            finally {
                try {
                    dataOutputStream.close();
                    dataInputStream.close();
                    in.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
