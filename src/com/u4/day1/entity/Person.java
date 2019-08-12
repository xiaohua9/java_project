package com.u4.day1.entity;
//人实体类
public class Person {
    //属性：编号，姓名，性别，地址，生日
    private int id;
    private String name;
    private String gender;
    private String address;
    private String birthday;
    //构造方法
    public Person() { }
    //没有编号的构造方法
    public Person(String name, String gender, String address, String birthday) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
    }
    //全参构造
    public Person(int id, String name, String gender, String address, String birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
    }
    //set/get方法
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
