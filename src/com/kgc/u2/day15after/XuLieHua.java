package com.kgc.u2.day15after;

import java.io.*;

public class XuLieHua {
    public static void main(String[] args) {
        Student student1 = new Student("小华", 23, "男");
        Student student3 = new Student("小明", 23, "男");
        Student[] st=new Student[10];
        FileOutputStream fo = null;
        ObjectOutputStream os = null;

        FileInputStream fi=null;
        ObjectInputStream oi=null;
        try {
            fo = new FileOutputStream("d:/javafile/student.txt");
            os = new ObjectOutputStream(fo);
            os.writeObject(student1);
            os.writeObject(student3);
            os.writeObject(null);//解决oi.readObject()抛出的异常

            fi=new FileInputStream("d:/javafile/student.txt");
            oi=new ObjectInputStream(fi);

            for (int i=0;(st[i]=(Student)oi.readObject())!=null;i++){
                System.out.println(st[i].name);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
       } catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                os.close();
                fo.close();
                oi.close();
                fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
