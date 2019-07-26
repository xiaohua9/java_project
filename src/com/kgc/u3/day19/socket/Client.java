package com.kgc.u3.day19.socket;

import java.io.*;
import java.net.Socket;
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket=new Socket("localhost",5531);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
        bufferedWriter.write("www.baidu.com");
        bufferedWriter.flush();
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
       System.out.println("对方："+bufferedReader.readLine());

        bufferedReader.close();
        inputStream.close();
        bufferedWriter.close();
        outputStream.close();
        socket.close();
    }
}
