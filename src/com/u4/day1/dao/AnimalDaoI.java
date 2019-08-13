package com.u4.day1.dao;

import com.u4.day1.entity.Animal;

//动物的dao接口继承抽象dao接口
public interface AnimalDaoI extends DaoI<Animal> {
    //没有扩展的功能，所以为空
}
