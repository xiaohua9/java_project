package com.kgc.u2.day16.atm;

public class NotNegativeNumberException extends Exception {
    public NotNegativeNumberException() {
        System.out.println("输入金额不能小于0");
    }
}
