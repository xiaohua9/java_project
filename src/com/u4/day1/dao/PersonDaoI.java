package com.u4.day1.dao;

import com.u4.day1.entity.Person;

//人的dao接口继承顶层的抽象接口
public interface PersonDaoI extends DaoI<Person>{
    //人的dao没有扩展的功能，所以这里为空
}
