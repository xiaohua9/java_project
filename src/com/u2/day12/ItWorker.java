package com.u2.day12;
//it工作者的类
public class ItWorker {
    //属性：姓名，年龄，技术方向，工作年限
    private String name;
    private int age;
    private String technoology;
    private int workAge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTechnoology() {
        return technoology;
    }

    public void setTechnoology(String technoology) {
        this.technoology = technoology;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
//////工作的方法
    public void work(){
        System.out.println(this.name+"正在工作");
    }
}
