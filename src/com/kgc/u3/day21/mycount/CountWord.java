package com.kgc.u3.day21.mycount;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

//功    能：该类实现文档中每一个单词的出现次数统计
//使用方法：通过类名调用静态countWord方法，传入文件即可
public class CountWord {
    public static void countWord(File file)throws Exception {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();//单词计数仓库
        //构建输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "gbk"));
        String s;//临时存储字符串
        String[] word;//临时储存字符串数组
        while ((s = bufferedReader.readLine()) != null) {
            word = s.split(" ");//根据空格拆分成字符串数组
            //将字符串存入计数仓库
            for (int i = 0; i < word.length; i++) {
                if (hashMap.keySet().contains(word[i])) {//如果该单词已存在，就给值加1
                    hashMap.put(word[i],hashMap.get(word[i])+1);
                }else {
                    hashMap.put(word[i],1);//如果该单词不存在，值为1
                }
            }
        }
        bufferedReader.close();
        //输出每一个单词的数量
        Iterator<String> iterator = hashMap.keySet().iterator();//获取键的迭代器
        while (iterator.hasNext()){
            String tmp=iterator.next();
            System.out.println(tmp+":"+hashMap.get(tmp)+"个");
        }
    }
}
