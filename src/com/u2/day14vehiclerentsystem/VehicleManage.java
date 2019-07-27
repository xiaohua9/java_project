package com.u2.day14vehiclerentsystem;
import java.util.InputMismatchException;
import java.util.Scanner;
//车辆管理类
public class VehicleManage {
    public static void main(String[] args) {
        System.out.println("欢迎来到车辆租赁系统");
        VehicleOperation.init();//先把仓库填满
        Vehicle vehicle=VehicleOperation.find(VehicleOperation.select());//客户选车并在车库查找，返回对象
        Scanner input=new Scanner(System.in);
        System.out.print("请输入您租赁的天数：");
        try {
            int dayNumber = input.nextInt();
            double rentPrice=vehicle.rentPrice(dayNumber);//调用租金算法，计算费用
            System.out.println("您的车牌号是："+vehicle.getCarId());
            System.out.println("您要支付的费用："+rentPrice);
        }catch (InputMismatchException e){
            System.out.println("天数输入错误，租赁失败");
        }
    }
}
