package com.u3.day17.three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {
    //属性：姓名，密码
    private String name;
    private String password;
    //构造方法

    public User() {
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    //set/get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<User> list=new ArrayList<User>();//连续序列容器
        for (int i=1;i<11;i++){
            list.add(new User("name"+i,"password"+i));
        }
        for (int i=0;i<list.size();i++){//for循环遍历集合
            System.out.println(list.get(i));
        }
        Iterator<User> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());//迭代器遍历
        }
    }
}
