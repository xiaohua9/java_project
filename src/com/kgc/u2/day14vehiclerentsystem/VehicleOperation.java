package com.kgc.u2.day14vehiclerentsystem;
//车的操作类
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class VehicleOperation {
    //创建一个存储Vehicle类型数据的链式有序集合,作为储存车辆的仓库
    private static LinkedList<Vehicle> list=new LinkedList<Vehicle>();
    //给仓库上货
    public static void init() {
        list.add(new Car("宝马", "京NY28588", 800, "X6"));
        list.add(new Car("宝马", "京CNY3284", 600, "550i"));
        list.add(new Car("别克", "京NT37465", 300, "543g"));
        list.add(new Car("别克", "京NT96968", 600, "GL8"));
        list.add(new Bus("金杯", "京6566754", 800, 16));
        list.add(new Bus("金杯", "京9696996", 1500, 34));
        list.add(new Bus("金龙", "京8696997", 800, 16));
        list.add(new Bus("金龙", "京8696998", 1500, 34));
    }
    //车辆选择方法
    public static Vehicle select(){
        String brand;//三个临时储存的变量
        String type;
        int seats;
        Scanner input=new Scanner(System.in);
        System.out.print("1、汽车\t2、客车\n请选择车型：");
        String tmpChooce=input.next();//临时存储选项的变量
        if ("1".equals(tmpChooce)){
            System.out.print("1、别克\t2、宝马\n请选择品牌：");
            tmpChooce=input.next();
            if ("1".equals(tmpChooce)){
                brand="别克";
                System.out.print("1、543g\t2、GL8\n请选择型号：");
                tmpChooce=input.next();
                type="1".equals(tmpChooce)?"543g":"GL8";
            }else {
                brand="宝马";
                System.out.print("1、X6\t2、550i\n请选择型号：");
                tmpChooce=input.next();
                type="1".equals(tmpChooce)?"X6":"550i";
            }
            return new Car(brand,type);//该对象就是用来在车库中匹配出更详细数据的引子
        }else {
            System.out.print("1、金杯\t2、金龙\n请选择品牌：");
            tmpChooce=input.next();
            if ("1".equals(tmpChooce)){
                brand="金杯";
                System.out.print("1、16座\t2、34座\n请选择座位数：");
                tmpChooce=input.next();
                seats="1".equals(tmpChooce)?16:34;
            }else {
                brand="金龙";
                System.out.print("1、16座\t2、34座\n请选择座位数：");
                tmpChooce=input.next();
                seats="1".equals(tmpChooce)?16:34;
            }
            return new Bus(brand,seats);//该对象就是用来在车库中匹配出更详细数据的引子
        }
    }
    //在车库查找车辆，并返回车库中该车辆的对象
    public static Vehicle find(Vehicle v1) {
        Iterator<Vehicle> itor = list.iterator();//注意，一定要拿Java、util包的迭代器类
        while (itor.hasNext()) {
            Vehicle vehicle = itor.next();
            if (vehicle.equals(v1)) {
                return vehicle;
            }
        }
        return null;
    }
}
