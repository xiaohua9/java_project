package com.kgc.u3.day21.myserilazable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<User> list=new ArrayList<User>();//用户资料仓库
        list.add(new User(23,"xiaohua"));
        list.add(new User(26,"xiaoming"));
        list.add(new User(19,"xiaojun"));
        list.add(new User(24,"xiaoli"));
        list.add(new User(22,"xiaosun"));
        list.add(new User(17,"xiaoliu"));
        File file=new File("C:\\Users\\Administrator\\Desktop\\aa.txt");
        try {
            UserUtils.write(list,file);//存
        } catch (Exception e) {
        }
        try {
            System.out.println(UserUtils.read(file));//读
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
