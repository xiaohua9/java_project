package com.u4.day1.dao.impl;
import com.u4.day1.dao.AnimalDaoI;
import com.u4.day1.entity.Animal;
import com.u4.day1.util.AnimalUtil;
import java.util.List;
//动物的数据库访问
public class AnimalDaoImpl implements AnimalDaoI {
    //增加数据,返回增加的条数
    public int insert(Animal animal){
        //构造sql字符串
        String sql="insert into animal values(?,?)";
        //调用工具执行sql
        return AnimalUtil.change(sql,animal.getId(),animal.getName());
    }
    //删除数据，返回删除的条数
    public int delete(Animal animal){
        //构造sql字符串
        String sql="delete from animal where id=?";
        //调用工具执行sql
        return AnimalUtil.change(sql,animal.getId());
    }
    //修改数据,返回修改的条数
    public int update(Animal animal){
        //构造sql字符串
        String sql="update animal set name=? where id=?";
        //调用工具执行sql
        return AnimalUtil.change(sql,animal.getName(),animal.getId());
    }
    //查询一条数据
    public Animal select(Object id){
        //构造sql字符串
        String sql="select * from animal where id=?";
        //调用工具执行sql
        return AnimalUtil.select(sql,id);
    }
    //查询所有数据
    public List<Animal> selectAll(){
        //构造sql字符串
        String sql="select * from animal";
        //调用工具执行sql
        return AnimalUtil.selectAll(sql);
    }
}
