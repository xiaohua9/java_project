package com.kgc.u3.day21.myserilazable;

import java.io.*;
import java.util.List;

public class UserUtils {
    public static void write(List<User> list, File file) throws Exception{  //静态存入方法
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file,true));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
    }
    public static List<User> read(File file) throws Exception{  //静态读取方法
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
        List<User> list=(List<User>)objectInputStream.readObject();
        objectInputStream.close();
        return list;
    }

}
