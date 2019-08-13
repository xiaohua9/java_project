package com.u4.day1.util;
import com.u4.day1.entity.Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//动物的工具类
public class AnimalUtil {
    //向数据库增删改数据
    public static int change(String sql,Object...parameter){
        int flag=0;//sql执行影响的行数
        try {
            //获取数据库连接，创建sql预执行器
            Connection connection = GetConnectionAndClose.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //搭配传来的参数，执行传来的sql字符串
            for (int i=0;i<parameter.length;i++){
                preparedStatement.setObject(i+1,parameter[i]);//将参数赋值给占位符
            }
            flag=preparedStatement.executeUpdate();
            //关闭连接
            GetConnectionAndClose.close(preparedStatement,connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;//返回影响的行数
    }
    //向数据库查询数据(指定一条)
    public static Animal select(String sql,Object parameter){
        Animal animal=new Animal();
        try {
            //获取数据库连接，创建sql预执行器
            Connection connection = GetConnectionAndClose.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //搭配传来的参数，执行传来的sql字符串
            preparedStatement.setObject(1,parameter);//将参数赋值给占位符
            ResultSet resultSet = preparedStatement.executeQuery();
            //将查到的数据封装成Animal对象
            if (resultSet.next()) {
                animal.setId(resultSet.getInt(1));
                animal.setName(resultSet.getString(2));
            }
            //关闭连接
            GetConnectionAndClose.close(preparedStatement,connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animal;//返回对象
    }
    //向数据库查询数据(全部)
    public static List<Animal> selectAll(String sql){
        List<Animal> list=new ArrayList<Animal>();//存放人的集合
        try {
            //获取数据库连接，创建sql预执行器
            Connection connection = GetConnectionAndClose.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //执行传来的sql字符串
            ResultSet resultSet = preparedStatement.executeQuery();
            //将查到的数据封装成集合对象
            while (resultSet.next()) {
                Animal animal=new Animal();
                animal.setId(resultSet.getInt(1));
                animal.setName(resultSet.getString(2));
                list.add(animal);//将数据添加进集合
            }
            //关闭连接
            GetConnectionAndClose.close(preparedStatement,connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;//返回对象
    }
}
