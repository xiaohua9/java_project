package com.kgc.u3.day20.one;

import java.io.File;
import java.util.Date;

public class FileInfo {
    public static void main(String[] args) {
        File file=new File("D:\\javafile\\java_project\\DVDinformation.txt");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(new Date(file.lastModified()).toString());
    }
}
