package com.kgc.u2.day14vehiclerentsystem;
//车的抽象父类
public abstract class Vehicle {
    //属性
    private String brand;//品牌
    private String carId;//车牌号
    private double rent;//日租金

    //构造方法
    public Vehicle() { }
    public Vehicle(String brand, String carId, double rent) {
        this.brand = brand;
        this.carId = carId;
        this.rent = rent;
    }
    //get/set方法
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getCarId() {
        return carId;
    }
    public void setCarId(String carId) {
        this.carId = carId;
    }
    public double getRent() {
        return rent;
    }
    public void setRent(double rent) {
        this.rent = rent;
    }

    //根据天数计算租金的方法，参数是客户租赁的天数
    public abstract double rentPrice(int dayNumber);
}
