package com.kgc.u3.day19.socket;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//服务器
public class Service {
    public static void main(String[] args) throws Exception{

        Socket socket = new ServerSocket(5531).accept();//监听客户端的套接字
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            System.out.println("对方：" + bufferedReader.readLine());
            bufferedWriter.write("zai");

            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
    }
}
