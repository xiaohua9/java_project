package com.kgc.u3.day25.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws  Exception {
        DatagramSocket server=new DatagramSocket(0);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while((str=br.readLine())!=null) {
            if("exit".equals(str)){
                break;
            }
            byte[] byts = str.getBytes();
            DatagramPacket packet = new DatagramPacket(byts, byts.length, InetAddress.getByName("localhost"), 1055);
            server.send(packet);
        }
        System.out.println("客户端结束");
    }
}
