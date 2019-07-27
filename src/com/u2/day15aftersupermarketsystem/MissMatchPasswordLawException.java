package com.u2.day15aftersupermarketsystem;

public class MissMatchPasswordLawException extends Exception {
    public MissMatchPasswordLawException() {
        System.out.println("输入的密码不符合规则");
    }
}
