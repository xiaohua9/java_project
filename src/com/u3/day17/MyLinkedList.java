package com.u3.day17;
//实现双向链表

//先定义一个泛型接口
interface ILink<T>{
    boolean add(T data);//向链表添加数据
    int contains(T data);//判断链表是否存在，反索引
    boolean remove(T data);//删除数据
    T set(int index,T newData);//修改数据
    T get(int index);//获取数据
    void clear();//清空
    T[] toArray();//转换成数组
    int size();//大小
    void printLink();//遍历链表
}
public class MyLinkedList<T> implements ILink<T>{
    private Node first;//该链表的第一个节点
    private Node last;//最后一个节点
    private int size;//链表的大小
    private class Node{
        private Node head;//节点的头部，用于存上一个节点
        private T data;//本节点的数据
        private Node tail;//节点的尾部，用于存下一个节点
        //构造方法
        public Node(Node head, T data, Node tail) {
            this.head = head;
            this.data = data;
            this.tail = tail;
        }
    }
    @Override
    public boolean add(T data) {
        Node newNode=new Node(this.last,data,null);//添加节点在尾部添加，所以头部指向添加前的尾节点，尾部为空
        if (this.first==null){
            this.first=newNode;//此时新节点也是第一个节点
        }else {
            this.last.tail=newNode;//将最后一个节点的尾部指向新节点
        }
        this.last=newNode;//添加完成，此时新节点就成为最后一个节点了
        this.size++;
        return true;
    }

    @Override
    public int contains(T data) {
        if (data==null){
            int i=0;//索引
            for (Node tmp=this.first;tmp!=null;tmp=tmp.tail){
                if (tmp.data==null){
                    return i;
                }
                i++;
            }
        }else{
            int i=0;//索引
            for (Node tmp=this.first;tmp!=null;tmp=tmp.tail){
                if (data.equals(tmp.data)){
                    return i;
                }
                i++;
            }
        }
        return -1;//链表中不存在的话，返回-1
    }

    @Override
    public boolean remove(T data) {
        if (data==null){
            for (Node tmp=this.first;tmp!=null;tmp=tmp.tail){
                if (data==tmp.data){
                    //删除动作
                    if (tmp.head==null){//删除节点在第一个时(包括只有一个节点时)
                        this.first=tmp.tail;
                    }else if (tmp.tail==null){//删除节点在最后一个时
                        this.last=tmp.head;
                    }else {//删除节点在中间时
                        tmp.head.tail=tmp.tail;//当前节点的头部的尾部（上一个节点的尾部）指向当前节点的尾部（下一个节点）
                        tmp.tail.head=tmp.head;//当前节点的尾部的头部（下一个节点的头部）指向当前节点的头部（上一个节点）
                    }
                    tmp=null;
                    this.size--;
                    return true;
                }
            }
        }else {
            for (Node tmp=this.first;tmp!=null;tmp=tmp.tail){
                if (data.equals(tmp.data)){
                    //删除动作
                    if (tmp.head==null){//删除节点在第一个时(包括只有一个节点时)
                        this.first=tmp.tail;
                    }else if (tmp.tail==null){//删除节点在最后一个时
                        this.last=tmp.head;
                    }else {//删除节点在中间时
                        tmp.head.tail=tmp.tail;//当前节点的头部的尾部（上一个节点的尾部）指向当前节点的尾部（下一个节点）
                        tmp.tail.head=tmp.head;//当前节点的尾部的头部（下一个节点的头部）指向当前节点的头部（上一个节点）
                    }
                    tmp=null;
                    this.size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public T set(int index, T newData) {
        int i=0;
        Node tmp;
        for ( tmp=this.first;tmp!=null;tmp=tmp.tail){
            i++;
        }
        if (index>i){
            return null;//索引不存在，设置失败
        }
        i=0;
        for ( tmp=this.first;tmp!=null&&i!=index;tmp=tmp.tail){
            i++;
        }
        tmp.data=newData;//修改index处的数据
        return newData;
    }

    @Override
    public T get(int index) {
        int i=0;
        Node tmp;
        for ( tmp=this.first;tmp!=null;tmp=tmp.tail){
            i++;
        }
        if (index>i){
            return null;//索引不存在，获取失败
        }
        i=0;
        for ( tmp=this.first;tmp!=null&&i!=index;tmp=tmp.tail){
            i++;
        }
        return tmp.data;
    }

    @Override
    public void clear() {
        this.first=null;
        this.last=null;
        this.size=0;
    }

    @Override
    public T[] toArray() {
        T[] objects=(T[])(new Object[this.size]);
        int i=0;
        for (Node tmp=this.first;tmp!=null;tmp=tmp.tail){
            objects[i++]=tmp.data;
        }
        return objects;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void printLink() {
        T[] data=this.toArray();
        for (T i:data){
            System.out.println(i);//重写toString方法
        }
    }
}
