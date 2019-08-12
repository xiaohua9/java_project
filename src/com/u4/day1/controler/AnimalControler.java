package com.u4.day1.controler;
import com.u4.day1.dao.AnimalDao;
import com.u4.day1.entity.Animal;
//动物的操作层
public class AnimalControler {
    public static void main(String[] args) throws Exception{
        AnimalDao animalDao=new AnimalDao();//动物的数据访问对象
        Animal animal=new Animal(103,"鸭");
        //animalDao.insert(animal);//增
        //animalDao.update(animal);//改
        //animalDao.delete(animal);//删
        //Animal select = animalDao.select(102);//查一个
        //System.out.println(select);
        System.out.println(animalDao.selectAll());//查全部
    }
}
