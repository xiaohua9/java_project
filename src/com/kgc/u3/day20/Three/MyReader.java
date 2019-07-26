package com.kgc.u3.day20.Three;

import java.io.*;

public class MyReader {
    public static void main(String[] args) throws Exception{
        //读取
        File file=new File("D:\\javafile\\java_project\\DVDinformation.txt");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file),"gbk"));
        String s;
        //复制
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\a.txt"),"gbk"));
        while ((s=bufferedReader.readLine())!=null) {
            bufferedWriter.write(s);//读一行，写一行
            bufferedWriter.newLine();
            bufferedWriter.flush();//缓冲流需要，否则就困死在流中了
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
