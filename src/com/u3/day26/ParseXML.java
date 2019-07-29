/*
* 使用dom4j解析以下xml内容，并将解析出来的内容用作Java对象的赋值
* ----------------------------------------------
<?xml version="1.0" encoding="UTF-8"?>
<students>
	<student id="101">
		<name>zhangsan</name>
		<age>19</age>
	</student>
	<student id="102">
		<name>lisi</name>
		<age>23</age>
	</student>
	<student id="103">
		<name>wangwu</name>
		<age>31</age>
	</student>
	<student id="104">
		<name>zhaoliu</name>
		<age>15</age>
	</student>
</students>
* */
package com.u3.day26;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseXML {
    public static void main(String[] args) throws Exception{
        Student student=new Student();//一个学生
        //获取指定的xml文件对象
        Document document = new SAXReader().read("C:\\Users\\Administrator\\Desktop\\student.xml");
        //获取根节点
        Element rootElement = document.getRootElement();
        Iterator<Element> iterator = rootElement.elementIterator();//获得所有一级子元素
        while (iterator.hasNext()){//遍历一级子元素
            Element element = iterator.next();
            student.setId(element.attributeValue("id"));//获取当前元素节点指定属性的值,并赋值
            Iterator<Element> iterator1 = element.elementIterator();//获取当前元素的所有子元素
            student.setName(iterator1.next().getText());//得到当前姓名元素的文本内容
            student.setAge(Integer.parseInt(iterator1.next().getText()));//得到当前年龄元素的文本内容，再转为int再赋值
            System.out.println(student);//输出该对象
        }
        print(rootElement);//调用递归方法
    }
    //在递归方法的架构下进行xml解析，并输出信息
    public static void print(Element element){
        Iterator<Attribute> attributeIterator = element.attributeIterator();//获取该标签的所有属性
        while (attributeIterator.hasNext()){
            System.out.println(element.attributeValue(attributeIterator.next().getName()));
        }
        /*
        * 因为xml标签如果没有文本内容，其实就默认有几个换行符（小常识），如果直接输出获取的文本，格式就很莫名其妙。
        * 此处恰到好处被正则表达式对应上，“.”正好唯一不匹配换行，灵光一闪，真实绝了
        * */
        Matcher matcher = Pattern.compile(".*").matcher(element.getText());//准备正则和文本
        if (matcher.matches()){//全局匹配
            System.out.println(matcher.group());//输出
        }
        Iterator<Element> elementIterator = element.elementIterator();//获取该标签的所有一级子标签
        while (elementIterator.hasNext()){
            print(elementIterator.next());
        }
    }
}
