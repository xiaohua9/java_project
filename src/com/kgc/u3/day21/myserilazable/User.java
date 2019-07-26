package com.kgc.u3.day21.myserilazable;

import java.io.Serializable;

public class User implements Serializable {
    //属性：序号，姓名
    private int id;
    private String name;
////构造方法
    public User() {
    }
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
//////set/get方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
