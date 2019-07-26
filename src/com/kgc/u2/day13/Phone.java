package com.kgc.u2.day13;

public class Phone implements USB,Mp3{
    @Override
    public void play() {
        System.out.println("play now");
    }

    @Override
    public void read() {
        System.out.println("read now");
    }

    @Override
    public void write() {
        System.out.println("write now");
    }

    public static void main(String[] args) {
        USB usb=new Phone();
        usb.read();
        usb.write();
        ((Phone) usb).play();
        System.out.println(usb instanceof Mp3);//因为Phone也实现了Mp3的接口，所以也ture
        ((Mp3) usb).play();//在这里说明了一个问题，向下和横向转型都要强转

    }
}
