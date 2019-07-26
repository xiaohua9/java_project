package com.kgc.u2.day14vehiclerentsystem;

public class Car extends Vehicle {
    private String type;//新增特有属性：型号
    //构造方法
    public Car() { }
    public Car(String brand,String type) {
        this.setBrand(brand);
        this.type = type;
    }
    public Car(String brand, String carId, double rent, String type) {
        super(brand, carId, rent);
        this.type = type;
    }
    //set,get方法
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    //重写租金计算方法
    @Override
    public double rentPrice(int dayNumber) {
        double rent = getRent();
        double price=rent*dayNumber;
        if(dayNumber>7&&dayNumber<=30){
            price*=0.9;
        }else if(dayNumber>30&&dayNumber<=150){
            price*=0.8;
        }else if(dayNumber>150){
            price*=0.7;
        }
        return price;
    }
    /*
     * 重写equals方法,车型和型号相同，就相等，
     * 该方法用途在于：通过客户输入的车型和型号，匹配勾连出车库里的对应车辆，以获取更详细的信息。
     * 从而能够实现后续的车牌号输出和租金计算
     * */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car){
            Car car=(Car)obj;
            if (this.getBrand().equals(car.getBrand())&&this.type.equals(car.type)){
                return true;
            }
        }
        return false;
    }
}
