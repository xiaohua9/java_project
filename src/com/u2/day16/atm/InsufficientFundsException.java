package com.u2.day16.atm;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        System.out.println("取款金额不能大于余额");
    }
}
