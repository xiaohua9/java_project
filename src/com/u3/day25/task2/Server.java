package com.u3.day25.task2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception{
        DatagramSocket server=new DatagramSocket(1055);
        System.out.println("服务器已启动......");

        for (int i=1;;i++){
            byte[] byts = new byte[200];
            DatagramPacket packet = new DatagramPacket(byts, byts.length);
            try {
                server.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            new DatagramServerThread(server,i,packet).start();
        }

    }
}
class DatagramServerThread extends Thread {
    private DatagramSocket server;
    private int i;
    private DatagramPacket packet;
    public DatagramServerThread(DatagramSocket server,int i,DatagramPacket packet) {
        this.server = server;
        this.i=i;
        this.packet=packet;
    }

    @Override
    public void run() {

        byte[] data = packet.getData();
        String str = new String(data, 0, data.length);
        System.out.println("客户端第"+i+"次说:" + str);
    }
}

