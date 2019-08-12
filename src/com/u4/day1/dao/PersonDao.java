package com.u4.day1.dao;

import com.u4.day1.entity.Person;
import com.u4.day1.util.PersonUtil;

import java.util.List;

//人的数据库访问类
public class PersonDao {
    //增加数据,返回增加的条数
    public int insert(Person person){
        //构造sql字符串
        String sql="insert into person values("+person.getId()+",'"+person.getName()+"','"+person.getGender()+"','"+person.getAddress()+"','"+person.getBirthday()+"')";
        //调用工具执行sql
        return PersonUtil.change(sql);
    }
    //删除数据，返回删除的条数
    public int delete(Person person){
        //构造sql字符串
        String sql="delete from person where id="+person.getId();
        //调用工具执行sql
        return PersonUtil.change(sql);
    }
    //修改数据,返回修改的条数
    public int update(Person person){
        //构造sql字符串
        String sql="update person set name='"+person.getName()+"',gender='"+person.getGender()+"',address='"+person.getAddress()+"',birthday='"+person.getBirthday()+"' where id="+person.getId();
        //调用工具执行sql
        return PersonUtil.change(sql);
    }
    //查询一条数据
    public Person select(int id){
        //构造sql字符串
        String sql="select * from person where id="+id;
        //调用工具执行sql
        return PersonUtil.select(sql);
    }
    //查询所有数据
    public List<Person> selectAll(){
        //构造sql字符串
        String sql="select * from person";
        //调用工具执行sql
        return PersonUtil.selectAll(sql);
    }
}
