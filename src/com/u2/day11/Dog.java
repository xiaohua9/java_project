package com.u2.day11;
//狗类，扩展一个性别属性
public class Dog extends Animal{
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public Dog(String name, int age, String colour, String sex) {
        super(name, age, colour);
        this.sex = sex;
    }

    public static void main(String[] args) {
        Dog dog=new Dog("kity",1,"yellow","雄");
        dog.run();
    }
}
