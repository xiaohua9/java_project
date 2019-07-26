package com.kgc.u2.day15after;

import java.io.File;
import java.io.IOException;

public class IoFile {
    public static void main(String[] args) {
        File file =new File("d:/javafile/1.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (file.exists()){
            System.out.println(file.length());
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
        }

        char[] chr={'a','f'};
        System.out.println(chr);
    }
}
