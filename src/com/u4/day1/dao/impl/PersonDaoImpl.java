package com.u4.day1.dao.impl;
import com.u4.day1.dao.PersonDaoI;
import com.u4.day1.entity.Person;
import com.u4.day1.util.PersonUtil;
import java.util.List;
//人的数据库访问类
public class PersonDaoImpl implements PersonDaoI {
    //增加数据,返回增加的条数
    public int insert(Person person){
        //构造sql字符串
        String sql="insert into person values(?,?,?,?,?)";
        //调用工具执行sql
        return PersonUtil.change(sql,person.getId(),person.getName(),person.getGender(),person.getAddress(),person.getBirthday());
    }
    //删除数据，返回删除的条数
    public int delete(Person person){
        //构造sql字符串
        String sql="delete from person where id=?";
        //调用工具执行sql
        return PersonUtil.change(sql,person.getId());
    }
    //修改数据,返回修改的条数
    public int update(Person person){
        //构造sql字符串
        String sql="update person set name=?,gender=?,address=?,birthday=? where id=?";
        //调用工具执行sql
        return PersonUtil.change(sql,person.getName(),person.getGender(),person.getAddress(),person.getBirthday(),person.getId());
    }
    //查询一条数据
    public Person select(Object id){
        //构造sql字符串
        String sql="select * from person where id=?";
        //调用工具执行sql
        return PersonUtil.select(sql,id);
    }
    //查询所有数据
    public List<Person> selectAll(){
        //构造sql字符串
        String sql="select * from person";
        //调用工具执行sql
        return PersonUtil.selectAll(sql);
    }
}
