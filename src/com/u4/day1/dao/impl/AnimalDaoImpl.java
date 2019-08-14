package com.u4.day1.dao.impl;
import com.u4.day1.dao.AnimalDaoI;
import com.u4.day1.entity.Animal;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;
//动物的数据库访问
public class AnimalDaoImpl implements AnimalDaoI {
    //增加数据,返回增加的条数
    public int insert(Animal animal){
        //构造sql字符串
        String sql="insert into animal values(?,?)";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        int flag=0;//sql影响的行数
        try {
            flag=runner.update(sql,animal.getId(),animal.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;//返回sql影响的行数
    }
    //删除数据，返回删除的条数
    public int delete(Animal animal){
        //构造sql字符串
        String sql="delete from animal where id=?";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        int flag=0;//sql影响的行数
        try {
            flag=runner.update(sql,animal.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;//返回sql影响的行数
    }
    //修改数据,返回修改的条数
    public int update(Animal animal){
        //构造sql字符串
        String sql="update animal set name=? where id=?";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        int flag=0;//sql影响的行数
        try {
            flag=runner.update(sql,animal.getName(),animal.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;//返回sql影响的行数
    }
    //查询一条数据
    public Animal select(Object id){
        //构造sql字符串
        String sql="select * from animal where id=?";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        Animal animal=null;//将查询结果赋值到改对象
        try {
            animal=runner.query(sql,new BeanHandler<Animal>(Animal.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animal;//返回结果对象
    }
    //查询所有数据
    public List<Animal> selectAll(){
        //构造sql字符串
        String sql="select * from animal";
        //构造sql执行对象
        QueryRunner runner=new QueryRunner(dataSource);
        //调用工具执行sql
        List<Animal> list=null;//将查询结果赋值到改对象
        try {
            list= runner.query(sql, new BeanListHandler<Animal>(Animal.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;//返回结果对象
    }

    /*查询一个表中某一字段的所有值
      public static void main(String[] args) {
        QueryRunner runner=new QueryRunner(dataSource);
        try {
            List<String> name = runner.query("select name from animal", new ColumnListHandler<String>());
            for (String na:name) {
                System.out.println(na);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
    /*查询出一个聚合函数的值
     public static void main(String[] args) {
        QueryRunner runner=new QueryRunner(dataSource);
        try {
            long num=runner.query("select count(*) from animal",new ScalarHandler<Long>());
            System.out.println(num);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}
