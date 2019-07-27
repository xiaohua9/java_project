package com.u2.day10;
import java.util.Scanner;

//单例模式：自行实例化，并且保证一个类只能有一个实例
// 懒汉单例模式：在实例化前先判断是否有实例了，如果有了，就懒得建立了，没有才建立
public class LazySimple {
    private String chairMan;//储存唯一对象的姓名
    private LazySimple() { }//构造方法私有，保证外界不能直接构造对象

    //对象的静态和非空判断来实现只能有一个实例，至于私有，肯定是保证外界不能访问
    private static LazySimple lazySimple=null;
    //因为构造已经静态，外界已经不能建立对象，所以要把这个唯一的出口方法定为静态，通过类名调用
    //这是外界获取唯一对象的入口
    public static LazySimple getLazySimple() {
        if (lazySimple==null){
            lazySimple=new LazySimple();
        }
        return lazySimple;
    }
    //获取唯一对象的属性
    public String getChairMan() {
        return chairMan;
    }
    //设置唯一对象的属性
    public void setChairMan() {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入总书记姓名：");
        this.chairMan = input.next();
    }
}

