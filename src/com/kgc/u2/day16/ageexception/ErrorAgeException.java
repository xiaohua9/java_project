package com.kgc.u2.day16.ageexception;

public class ErrorAgeException extends Exception{
    public ErrorAgeException() {
        System.out.println("年龄必须在0-100");
    }
}
