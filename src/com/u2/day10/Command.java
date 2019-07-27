package com.u2.day10;
//2019-7-5作业的总控制中心
public class Command {
    public static void main(String[] args) {
        System.out.println("**************************第1题**********************************");
        //构建一个计算器对象
        Calc calc=new Calc();
        calc.calcSelect();//调用计算选择功能

        System.out.println("**************************第2题**********************************");
        //创建一个人的对象名叫“阿美”，年龄18岁 身高160 性别 女
        People aMei=new People();
        aMei.setName("阿美");
        aMei.setAge(18);
        aMei.setHigh(160);
        aMei.setGender('女');
        aMei.speek();//说话
        aMei.calc();//计算
        aMei.changeName();//改名

        System.out.println("**************************第3.1题**********************************");
        //懒汉单例,获取唯一对象，先判断是否有实例了，如果有了，就懒得建立了，没有才建立，
        //再把这个对象返回
        System.out.println("懒汉单例给唯一对象属性赋值并获取");
        LazySimple lazySimple=LazySimple.getLazySimple();
        lazySimple.setChairMan();//给属性名字赋值
        System.out.println("现在的总书记是："+lazySimple.getChairMan());//获得唯一对象的名字属性的值

        System.out.println("**************************第3.2题**********************************");
        System.out.println("饿汉单例给唯一对象属性赋值并获取");
        HungrySimple.hungrySimple.setChairMan();//饿汉单例,创建唯一对象后，给属性名字赋值
        //获得唯一对象的名字属性的值
        System.out.println("现在的总书记是："+HungrySimple.hungrySimple.getChairMan());
    }
}
