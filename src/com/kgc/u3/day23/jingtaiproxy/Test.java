package com.kgc.u3.day23.jingtaiproxy;

public class Test {
    public static void main(String[] args) {
        BookProxy bookProxy=new BookProxy(new Book());
        bookProxy.sale();
    }
}
