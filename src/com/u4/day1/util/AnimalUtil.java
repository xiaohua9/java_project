package com.u4.day1.util;

import com.u4.day1.entity.Animal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//动物的工具类
public class AnimalUtil {
    //向数据库增删改数据
    public static int change(String sql){
        int flag=0;//sql执行影响的行数
        try {
            //获取数据库连接，创建sql执行器
            Statement statement = GetConnectionAndClose.getInstance().createStatement();
            //执行传来的sql字符串
            flag=statement.executeUpdate(sql);
            //关闭连接
            GetConnectionAndClose.close(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    //向数据库查询数据(指定一条)
    public static Animal select(String sql){
        Animal animal=new Animal();
        try {
            //获取数据库连接，创建sql执行器
            Statement statement = GetConnectionAndClose.getInstance().createStatement();
            //执行传来的sql字符串
            ResultSet resultSet = statement.executeQuery(sql);
            //将查到的数据封装成person对象
            if (resultSet.next()) {
                animal.setId(resultSet.getInt(1));
                animal.setName(resultSet.getString(2));
            }
            //关闭连接
            GetConnectionAndClose.close(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animal;//返回对象
    }
    //向数据库查询数据(全部)
    public static List<Animal> selectAll(String sql){
        List<Animal> list=new ArrayList<Animal>();//存放人的集合
        try {
            //获取数据库连接，创建sql执行器
            Statement statement = GetConnectionAndClose.getInstance().createStatement();
            //执行传来的sql字符串
            ResultSet resultSet = statement.executeQuery(sql);
            //将查到的数据封装成集合对象
            while (resultSet.next()) {
                Animal animal=new Animal();
                animal.setId(resultSet.getInt(1));
                animal.setName(resultSet.getString(2));
                list.add(animal);//将数据添加进集合
            }
            //关闭连接
            GetConnectionAndClose.close(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;//返回对象
    }
}
