package com.u2.day10;
//计算机类
import java.util.InputMismatchException;
import java.util.Scanner;
//私有所以具体的计算方法，建立一个计算选择的方法对外公开，并实现循环使用的功能
public class Calc {
    private static Scanner input=new Scanner(System.in);//定义一个私有的类扫描器
    private void plus() throws ArithmeticException, InputMismatchException {
        System.out.println("----->加法运算：");
        System.out.print("请输入第一个数：");
        int num1=input.nextInt();
        System.out.print("请输入第一个数：");
        int num2=input.nextInt();
        System.out.println(num1+"+"+num2+"="+(num1+num2));
    }
    private void minus() throws ArithmeticException, InputMismatchException{
        System.out.println("----->减法运算：");
        System.out.print("请输入第一个数：");
        int num1=input.nextInt();
        System.out.print("请输入第一个数：");
        int num2=input.nextInt();
        System.out.println(num1+"-"+num2+"="+(num1-num2));
    }
    private void times()throws ArithmeticException, InputMismatchException{
        System.out.println("----->乘法运算：");
        System.out.print("请输入第一个数：");
        int num1=input.nextInt();
        System.out.print("请输入第一个数：");
        int num2=input.nextInt();
        System.out.println(num1+"*"+num2+"="+(num1*num2));
    }
    private void divide()throws ArithmeticException, InputMismatchException{
        System.out.println("----->除法运算：");
        System.out.print("请输入第一个数：");
        int num1=input.nextInt();
        System.out.print("请输入第一个数：");
        int num2=input.nextInt();
        System.out.println(num1+"/"+num2+"="+(num1/num2));
    }
    public void calcSelect(){
        String com="y";//控制循环的变量
        do {
            System.out.println("请选择运算方式：\n1、加法\n2、减法\n3、乘法\n4、除法");
            String tmpCalc = input.next();//运算符选择储存器
            try {
                switch (tmpCalc) {
                    case "1":
                        plus();
                        break;
                    case "2":
                        minus();
                        break;
                    case "3":
                        times();
                        break;
                    case "4":
                        divide();
                        break;
                    default:
                        System.out.println("输入错误");
                }
            }catch (ArithmeticException e1){
                System.out.println("除数不能为0");
            }catch (InputMismatchException e2){
                System.out.println("不能输入非数字");
            }catch (Exception e3){
                System.out.println("输入错误");
            }
            do {
                System.out.print("你是否要继续（y/n）：");
                com=input.next();
            }while (!"y".equals(com)&&!"n".equals(com));
        }while ("y".equals(com));
    }
}
