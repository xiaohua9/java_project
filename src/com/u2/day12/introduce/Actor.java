package com.u2.day12.introduce;

public class Actor extends Person{
    //扩展属性：毕业院校，代表作
    private String school;
    private String worksl;

    public Actor() { }
    public Actor(String name, int age, String gender, String school, String worksl) {
        super(name, age, gender);
        this.school = school;
        this.worksl = worksl;
    }

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getWorksl() {
        return worksl;
    }
    public void setWorksl(String worksl) {
        this.worksl = worksl;
    }

    //实现介绍方法

    @Override
    public void introduce() {
        System.out.println("我叫"+this.getName()+",今年"+this.getAge()+"，毕业于"+this.school+",代表作是《"+this.worksl+"》");
    }
}
