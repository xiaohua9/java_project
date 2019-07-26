package com.kgc.u2.day14vehiclerentsystem;
//客车类，继承抽象车父类
public class Bus extends Vehicle {
    private int seats;//增加客车特有属性：座位数

    //构造方法
    public Bus() { }
    public Bus(String brand,int seats){
        this.setBrand(brand);
        this.seats=seats;
    }
    public Bus(String brand, String carId, double rent, int seats) {
        super(brand, carId, rent);
        this.seats = seats;
    }
    //set,get方法
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override//重写租金计算方法
    public double rentPrice(int dayNumber) {
        double rent = getRent();
        double price = rent*dayNumber;
        if(dayNumber>=3&&dayNumber<7){
            price*=0.9;
        }else if(dayNumber>=7&&dayNumber<30){
            price*=0.8;
        }else if(dayNumber>=30&&dayNumber<150){
            price*=0.7;
        }else if(dayNumber>=150){
            price*=0.7;
        }
        return price;
    }
    /*
    * 重写equals方法,车型和座位数相同，就相等，
    * 该方法用途在于：通过客户输入的车型和座位数，匹配勾连出车库里的对应车辆，以获取更详细的信息。
    * 从而能够实现后续的车牌号输出和租金计算
    * */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Bus){
            Bus bus= (Bus) obj;
            if(this.getBrand().equals(bus.getBrand())&&this.getSeats()==bus.getSeats()){
                return true;
            }
        }
        return false;
    }
}
