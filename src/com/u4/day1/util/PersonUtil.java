package com.u4.day1.util;
import com.u4.day1.entity.Person;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//人的操作工具类
public class PersonUtil {
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
        return flag;
    }
    //向数据库查询数据(指定一条)
    public static Person select(String sql,Object parameter){
        Person person=new Person();
        try {
            //获取数据库连接，创建sql预执行器
            Connection connection = GetConnectionAndClose.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //搭配传来的参数，执行传来的sql字符串
            preparedStatement.setObject(1,parameter);//将参数赋值给占位符
            ResultSet resultSet = preparedStatement.executeQuery();
            //将查到的数据封装成person对象
            if (resultSet.next()) {
                person.setId(resultSet.getInt(1));
                person.setName(resultSet.getString(2));
                person.setGender(resultSet.getString(3));
                person.setAddress(resultSet.getString(4));
                person.setBirthday(resultSet.getString(5));
            }
            //关闭连接
            GetConnectionAndClose.close(preparedStatement,connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;//返回对象
    }
    //向数据库查询数据(全部)
    public static List<Person> selectAll(String sql){
        List<Person> list=new ArrayList<Person>();//存放人的集合
        try {
            //获取数据库连接，创建sql预执行器
            Connection connection = GetConnectionAndClose.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //执行传来的sql字符串
            ResultSet resultSet = preparedStatement.executeQuery();
            //将查到的数据封装成集合对象
            while (resultSet.next()) {
                Person person=new Person();
                person.setId(resultSet.getInt(1));
                person.setName(resultSet.getString(2));
                person.setGender(resultSet.getString(3));
                person.setAddress(resultSet.getString(4));
                person.setBirthday(resultSet.getString(5));
                list.add(person);//将数据添加进集合
            }
            //关闭连接
            GetConnectionAndClose.close(preparedStatement,connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;//返回对象
    }
}
