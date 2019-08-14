package com.u4.day1.dao.impl;
import com.u4.day1.dao.PersonDaoI;
import com.u4.day1.entity.Person;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;
//人的数据库访问类
public class PersonDaoImpl implements PersonDaoI {
    //增加数据,返回增加的条数
    public int insert(Person person){
        //构造sql字符串
        String sql="insert into person values(?,?,?,?,?)";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        int flag=0;//sql影响的行数
        try {
            flag=runner.update(sql,person.getId(),person.getName(),person.getGender(),person.getAddress(),person.getBirthday());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;//返回sql影响的行数
    }
    //删除数据，返回删除的条数
    public int delete(Person person){
        //构造sql字符串
        String sql="delete from person where id=?";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        int flag=0;//sql影响的行数
        try {
            flag=runner.update(sql,person.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;//返回sql影响的行数
    }
    //修改数据,返回修改的条数
    public int update(Person person){
        //构造sql字符串
        String sql="update person set name=?,gender=?,address=?,birthday=? where id=?";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        int flag=0;//sql影响的行数
        try {
            flag=runner.update(sql,person.getName(),person.getGender(),person.getAddress(),person.getBirthday(),person.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;//返回sql影响的行数
    }
    //查询一条数据
    public Person select(Object id){
        //构造sql字符串
        String sql="select * from person where id=?";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        Person person=null;//将查询结果赋值到改对象
        try {
            person=runner.query(sql,new BeanHandler<Person>(Person.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;//返回结果对象
    }
    //查询所有数据
    public List<Person> selectAll(){
        //构造sql字符串
        String sql="select * from person";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        List<Person> list=null;//将查询结果赋值到改对象
        try {
            list= runner.query(sql, new BeanListHandler<Person>(Person.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;//返回结果对象
    }
}
