package com.u3.day17;

public class Test {
    public static void main(String[] args) {
        //测试我的双向链表
        ILink<String> iLink=new MyLinkedList<String>();
        iLink.add("火车头");
        iLink.add("火车1");
        iLink.add("火车2");
        iLink.add("火车3");
        iLink.add("火车尾");
        iLink.printLink();
        iLink.remove("火车2");
        iLink.printLink();
        System.out.println(iLink.size());
        System.out.println(iLink.contains("火车尾"));
        System.out.println(iLink.get(1) instanceof String);

    }
}
