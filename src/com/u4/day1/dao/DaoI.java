package com.u4.day1.dao;

import java.util.List;

//dao的顶层泛型接口
public interface DaoI<T> {
    //插入数据
    public int insert(T t);
    //删除数据
    public int delete(T t);
    //修改数据
    public int update(T t);
    //查询一条数据
    public T select(Object parameter);
    //查询所有数据
    public List<T> selectAll();
}
