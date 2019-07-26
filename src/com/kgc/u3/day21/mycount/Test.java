package com.kgc.u3.day21.mycount;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Administrator\\Desktop\\a.txt");
        try {
            CountWord.countWord(file);//调用，并处理异常
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
