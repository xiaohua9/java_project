package com.u4.day1.util;
import com.u4.day1.entity.Person;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//人的操作工具类
public class PersonUtil {
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
    public static Person select(String sql){
        Person person=new Person();
        try {
            //获取数据库连接，创建sql执行器
            Statement statement = GetConnectionAndClose.getInstance().createStatement();
            //执行传来的sql字符串
            ResultSet resultSet = statement.executeQuery(sql);
            //将查到的数据封装成person对象
            if (resultSet.next()) {
                person.setId(resultSet.getInt(1));
                person.setName(resultSet.getString(2));
                person.setGender(resultSet.getString(3));
                person.setAddress(resultSet.getString(4));
                person.setBirthday(resultSet.getString(5));
            }
            //关闭连接
            GetConnectionAndClose.close(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;//返回对象
    }
    //向数据库查询数据(全部)
    public static List<Person> selectAll(String sql){
        List<Person> list=new ArrayList<Person>();//存放人的集合
        try {
            //获取数据库连接，创建sql执行器
            Statement statement = GetConnectionAndClose.getInstance().createStatement();
            //执行传来的sql字符串
            ResultSet resultSet = statement.executeQuery(sql);
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
            GetConnectionAndClose.close(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;//返回对象
    }
}
