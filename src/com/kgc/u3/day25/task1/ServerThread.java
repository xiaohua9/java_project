package com.kgc.u3.day25.task1;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket socket;
    private int number;
    public ServerThread(Socket socket,int number) {//接收监听到的套接字,和记录是第几个套接字
        this.socket = socket;
        this.number=number;
    }

    @Override
    public void run() {
        DataInputStream dataInputStream=null;//读取客户端
        DataOutputStream dataOutputStream =null;//向客户端输出
        DataInputStream in=null;//读取键盘输入

        try {
            dataInputStream = new DataInputStream(this.socket.getInputStream());
            dataOutputStream = new DataOutputStream(this.socket.getOutputStream());
            in = new DataInputStream(System.in);

            byte[] bytes=new byte[500];
            int len=0;
            while ((len=dataInputStream.read(bytes))!=0){
                if ("exit".equals(new String(bytes,0,len-1))){//如果输入exit，就退出,-1是除去换行符
                    break;
                }
                System.out.print("第"+this.number+"个人说："+new String(bytes,0,len));
                System.out.print("我：");
                len=in.read(bytes);
                dataOutputStream.write(bytes,0,len);//把我说的话传给客户端
                dataOutputStream.flush();
            }
        } catch (Exception e) {

        }finally {
            try {
                dataOutputStream.close();
                dataInputStream.close();
                in.close();
            } catch (Exception e) {

            }
        }

    }
}
