package com.kgc.u2.day9;
//司机类
import java.util.Scanner;
public class Driver {
    String driverName;
    static Scanner input=new Scanner(System.in);
    //构造方法
    public Driver(){}
    public Driver(String driverName){
        this.driverName=driverName;
    }
    //选择驾驶的车
    public void selectCar(){
        System.out.println("选择您要驾驶的编号：1：轿车，2：客车，3：货车");
        String type=input.next();
        switch(type){
            case "1":
                Car car=new Car();
                System.out.print("您想开的速度值：");
                car.speed=input.nextInt();
                drive(car);
                break;
            case "2":
                CarTwo carTwo1=new CarTwo();
                System.out.print("您想开的速度值：");
                carTwo1.speed=input.nextInt();
                drive(carTwo1);
                break;
            case "3":
                Vehicle vehicle1=new Vehicle();
                System.out.print("您想开的速度值：");
                vehicle1.speed=input.nextInt();
                drive(vehicle1);
                break;
                default:
                    System.out.println("你皮，请你走路");
                    break;
        }
    }
    //驾驶小汽车的方法
    public void drive(Car car){
        System.out.println(this.driverName+"以"+car.speed+"的速度"+"驾驶着"+car.name);
    }
    //驾驶客车的方法
    public void drive(CarTwo carTwo){
        System.out.println(this.driverName+"以"+carTwo.speed+"的速度"+"驾驶着"+carTwo.name);
    }
    //驾驶货车的方法
    public void drive(Vehicle vehicle){
        System.out.println(this.driverName+"以"+vehicle.speed+"的速度"+"驾驶着"+vehicle.name);
    }
}
