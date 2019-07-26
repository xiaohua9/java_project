package com.kgc.u3.day20.two;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file=new File("D:\\javafile\\java_project\\src");
        list(file.listFiles());
    }
    public static void list(File[] files){ //递归算法
        for (File f:files){
            if(f.isFile()){
                System.out.println("文件："+f.getName());
            }else {
                System.out.println("目录："+f.getName());
                list(f.listFiles());
            }
        }
    }
}
