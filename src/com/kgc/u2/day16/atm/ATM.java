package com.kgc.u2.day16.atm;
import java.util.Scanner;
public class ATM {
    //属性：余额
    private double balance;
    public static Scanner input=new Scanner(System.in);
    //set/get方法
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //存款
    public void deposit(){
        System.out.print("请输入存款金额：");
        double tmpMoney= 0;
        try {
            tmpMoney = input.nextDouble();
            if (tmpMoney<0){//存款金额小于0，抛异常
                throw new NotNegativeNumberException();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (NotNegativeNumberException e){
            e.printStackTrace();
        }
        this.balance+=tmpMoney;
    }
    //取款
    public void withDraw(){
        System.out.print("请输入取款金额：");
        double tmpMoney= 0;
        try {
            tmpMoney = input.nextDouble();
            if (tmpMoney<0){//取款金额小于0，抛异常
                throw new NotNegativeNumberException();
            }
            if (tmpMoney>this.balance){//取款金额大于余额，抛异常
                throw new InsufficientFundsException();
            }
        } catch (NotNegativeNumberException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (InsufficientFundsException e){
            e.printStackTrace();
        }
        this.balance-=tmpMoney;
    }
    //显示余额
    public void showBalance(){
        System.out.println("当前余额："+this.balance);
    }
    //显示主页面
    public void headPage(){
        System.out.println("--------------------欢迎使用ATM系统-----------------------------");
        System.out.println("1.存款\n2.取款\n3.显示余额\n4.退出系统");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("请选择：");
    }
}
