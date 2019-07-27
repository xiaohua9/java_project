package com.u2.day11;
//人类
public class People {
    //属性：姓名，地址
    private String name ;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public People() {
    }

    public People(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
