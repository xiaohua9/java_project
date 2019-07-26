package com.kgc.u2.day10later;

public class Factory {
    public static People factory(String a){
        People people=null;
        if ("老师".equals(a)){
            return new Teacher();
        }else {
            return new Student();
        }
    }

}
