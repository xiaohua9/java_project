package com.u4.day1.controler;

import com.u4.day1.dao.impl.PersonDaoImpl;
import com.u4.day1.entity.Person;

//人的操作层
public class PersonControler {
    public static void main(String[] args) throws Exception{
        PersonDaoImpl personDao=new PersonDaoImpl();//人的数据访问对象
        Person person=new Person(108,"李四","男","北京", "2000-11-5");
        //personDao.insert(person);//增
        //personDao.update(person);//改
        //personDao.delete(person);//删
        //Person select = personDao.select(12);//查一个
        //personDao.delete(select);
        //System.out.println(select);
        System.out.println(personDao.selectAll());//查全部
    }
}
