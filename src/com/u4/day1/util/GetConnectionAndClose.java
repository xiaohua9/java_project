package com.u4.day1.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//由于每个类的util都要获得连接和关闭连接，且都是一样的，所以单独出来，增加复用
public class GetConnectionAndClose {
    private static Connection connection = null;//将会获得的连接对象
    //构造方法私有
    private GetConnectionAndClose() {
    }
    //获取连接对象的静态方法
    public static Connection getInstance() {
        if (connection == null) {//连接对象如果没有实例化，才实例化，以保证单例
            try {
                Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
                //获取连接对象
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xiaohua?useUnicode=true&characterEncoding=UTF-8", "mr", "hadoop");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    //关闭连接
    public static void close(Statement statement) {
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}