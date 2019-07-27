package com.u2.day12.two;

public class SonUser extends User{
    public SonUser() {
    }
    public SonUser(String name, String gender, int age, double high) {
        super(name, gender, age, high);
    }
    @Override
    public String toString() {
        return this.name+this.gender;//此处是异包子类，因为身高是类权，因此在这里没有访问的权力
        //年龄是包权，所以也没有访问的权限
    }
}
