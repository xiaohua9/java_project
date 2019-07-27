package com.u3.day25.task1;

import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket=new ServerSocket(5571);//获取服务器套接字
        System.out.println("服务器开启.......");
        for (int i=1;;i++){//记录来的第几个客户端
            new Thread(new ServerThread(serverSocket.accept(),i)).start();//一旦监听到，开启一个线程

        }
    }
}
