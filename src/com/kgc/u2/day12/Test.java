package com.kgc.u2.day12;

public class Test {
    public static void main(String[] args) {
        System.out.println("第一题***********************************************************");
        ItWorker itWorker=new ItWorker();
        itWorker.setName("xiaohau");
        itWorker.work();
        System.out.println("第二题***********************************************************");
        Circle circle=new Cylinder(12,10);
        circle.showInfo();//获取半径，周长，面积
        System.out.println("体积："+((Cylinder) circle).getVolume());//向下强转获取体积
        System.out.println("第四题***********************************************************");
        Book book=new Book();
        book.setBookName("道德经");
        book.setAuthor("老子");
        book.setPublisher("新华出版社");
        book.setPrice(100);
        book.showInfo();

    }

}
