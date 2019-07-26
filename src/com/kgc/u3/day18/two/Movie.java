package com.kgc.u3.day18.two;

public class Movie {
    private String name;
    boolean flag=true;

    public synchronized void get() {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
        flag=true;
        this.notify();
    }
    public synchronized void set(String name) {
        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name=name;
        flag=false;
        this.notify();
    }
}
