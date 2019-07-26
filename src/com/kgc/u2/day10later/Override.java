package com.kgc.u2.day10later;
//Object是所有类的直接或者间接父类
//重写了Object类的equals()和toString()实现所需规则的比较和所需信息的获得

public class Override {
    private String name ;
    private int age;

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

    //重写toString方法，返回自己想得到的
    public String toString() {
        return this.getName()+this.getAge();
    }


    //根据自己的规则重写equals方法
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (!(obj instanceof Override)){
            return false;
        }
        Override s=(Override)obj;
        if (this.getName().equals(s.getName())&&this.getAge()==s.getAge()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Override he=new Override();
        he.setName("xiaohua");
        he.setAge(23);
        System.out.println(he);
        Override he1=new Override();
        he1.setName("xiaohua");
        he1.setAge(23);
        System.out.println(he1);
        System.out.println(he==he1);
        System.out.println(he.equals(he1));
    }
}
