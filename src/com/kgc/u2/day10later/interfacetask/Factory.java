package com.kgc.u2.day10later.interfacetask;

public class Factory {
    public static People factory(String i){
        People people=null;
        if ("学生".equals(i)){
            return new Student();
        }else {
            return new Teacher();
        }
    }

}
