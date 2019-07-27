package com.u2.day9;
//这个类充当今天作业的总控制中心
public class Command {
    public static void main(String[] args) {
        System.out.println("**************************第1题**********************************");
        Triangle triangle=new Triangle();//构造三角形成功输出周长，不成功就重新构造

        System.out.println("**************************第2题**********************************");
        //创建一个人的对象
        People xiaohua=new People("小华",23,'男',1.68);
        xiaohua.speek();//介绍自己
        xiaohua.plus();//加法运算
        xiaohua.changeName();//改名字

        System.out.println("**************************第3题**********************************");
        //创建第一个机动车对象
        Car car1=new Car();
        car1.methodSpeek();//告诉用户当前在充当什么样的角色
        System.out.println("-->第一辆车原始数据");
        car1.allInfo();
        System.out.println("--->操作第一辆车");
        car1.chengeCarNumber();//改名
        car1.upSpeed();//加速
        //创建第二个机动车对象
        Car car2=new Car("鄂A5086",150,200);
        System.out.println("-->第二辆车原始数据");
        car2.allInfo();
        System.out.println("--->操作第二辆车");
        car2.downSpeed();//减速
        System.out.println("输出第一辆车的所有信息:");
        car1.allInfo();
        System.out.println("输出第二辆车的所有信息:");
        car2.allInfo();

        System.out.println("**************************第4题**********************************");
        //创建一个坐标点对象
        Point point=new Point();
        System.out.println("setX(5)前：\tx:"+point.x+",\t"+"y:"+point.y);
        point.setX(5);
        System.out.println("setX(5)后：\tx:"+point.getX()+",\t"+"y:"+point.y);

        System.out.println("**************************第5题**********************************");
        //创建一个交通工具对象
        Vehicle vehicle=new Vehicle();
        System.out.println("--->当前值");
        vehicle.setSpeed(100);//设置速度值
        vehicle.setSize(90);//设置体积值
        vehicle.outInfo();//输出速度值和体积值
        System.out.println("-->操作开始");
        vehicle.upSpeed();//加速
        vehicle.downSpeed();//减速

        System.out.println("**************************第6题**********************************");
        //创建一个员工对象和一个经理对象
        Employee employee=new Employee(8000,2000);
        Manager manager=new Manager(8000,5000,10000);
        //创建一个工资计算类的对象
        Salary salary=new Salary();
        salary.calc(employee);//计算员工的工资
        salary.calc(manager);//计算经理的工资

        System.out.println("**************************第7题**********************************");
        //构造一个车的对象
        CarTwo carTwo=new CarTwo("奔驰","黑色","北京");
        carTwo.run();//开车
        carTwo.run(240);//当前车速

        System.out.println("**************************第8题**********************************");
        //构造一个加法类对象
        System.out.println("int类型的加方法基础上重载一个double的加方法");
        Add add=new Add();
        System.out.println("1+2="+add.sum(1,2));
        System.out.println("1.2+3.1+4.9="+add.sum(1.2,3.1,4.9));

        System.out.println("**************************第9题**********************************");
        Driver driver=new Driver("小华");
        driver.selectCar();//选择要驾驶的车
    }
}
