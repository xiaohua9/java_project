package com.u3.day20.four;

import java.io.*;
import java.net.URL;

public class WebFile {
    public static void main(String[] args) throws Exception{
        //先获取网址，通过该对象可以获得一个字节输入流，之后就是io操作了
        URL url=new URL("http://kns.cnki.net/KCMS/detail/detail.aspx?dbcode=CPFD&dbname=CPFDPREP&filename=SYKJ201910001160&v=MjI0MzA5OFRuanFxeGRFZU1PVUtyaWZadTl2RVNqdFU3dkpJRndYTmpUQVpMRzRIOWpOcjQ5Rlplb0pEQk5LdWhkaG5q");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\ab.txt"),"utf-8"));
        String s;
        while ((s=bufferedReader.readLine())!=null){
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
