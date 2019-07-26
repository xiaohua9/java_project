package com.kgc.u3.day23.myjson;

import com.alibaba.fastjson.JSON;

public class JsonToJava {
    public static void main(String[] args) {
        Student student=new Student(1,"xiaohau","man");
        String json=JSON.toJSON(student).toString();//将Java的对象转为json的对象描述
        System.out.println(json);

        Student student1 = (Student) JSON.parseObject(json,Student.class);//将json对象转为Java对象
        System.out.println(student1.getName());
    }
}
