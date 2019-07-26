package com.kgc.u3.day23.jingtaiproxy;

public class BookProxy {
    private Book book;

    public BookProxy(Book book) {
        this.book = book;
    }
    public void sale(){
        System.out.println("before");
        this.book.sale();
        System.out.println("after");
    }
}
