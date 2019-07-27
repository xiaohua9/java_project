package com.u3.day20.four;

import java.io.*;

//循环接受键盘输入，将输入的内容写到文件中，如果输入exit则结束
public class KeyboardIn {
    public static void main (String[] args) throws Exception {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in,"utf-8"));
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\a.txt"),"utf-8"));
        String s;
        while (!"exit".equals(s=bufferedReader.readLine())){
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();

    }
}
