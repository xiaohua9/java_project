package com.kgc.u2.day12;

public class Book {
    //属性：书名，作者，出版社，价格
    private String bookName;
    private String author;
    private String publisher;
    private double price;

    //set/get方法
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //信息介绍的方法
    public void showInfo(){
        System.out.println("书名\t\t作者\t\t出版社\t\t价格");
        System.out.println(this.bookName+"\t\t"+this.author+"\t\t"+this.publisher+"\t"+this.price);
    }
}
