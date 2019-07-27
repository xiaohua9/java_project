package com.u2.day10later.Exception;
//自定义异常，继承异常类，构造异常时打印自定义的提示信息，使得一旦捕捉到该异常就输出提示
public class InException extends Exception{
    public InException() {
        System.out.println("输入错误啊");
    }
}
