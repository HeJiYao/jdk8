package com.hejiyao.demo.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream筛选和切片
 *
 * @author He_Ji_Yao
 */
public class StreamScreeningSlicesTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(8);
        list.add(1);
        list.forEach(System.out::println);
        System.out.println("-------------");
//        //1 筛选
//        //查询比5大的数字
//        list.stream().filter(l -> l.intValue() > 5).forEach(System.out::println);
//        System.out.println("-------------");
//        //截断，使其元素不超过给定的数量
//        list.stream().limit(3).forEach(System.out::println);
//        System.out.println("-------------");
//        //跳过，返回一个扔掉前n个元素的流，元素不够则返回一个空流
//        list.stream().skip(3).forEach(System.out::println);
//        System.out.println("-------------");
//        //筛选，通过hashCode和equals去除重复元素
//        list.stream().distinct().forEach(System.out::println);
//        System.out.println("-------------");
        
        //2 映射
        //将元素转换其他形式
//        list.stream().map(Integer::doubleValue).forEach(System.out::println);
//        System.out.println("-------------");
//        list.stream().map(Integer::doubleValue).filter(l -> l > 5).forEach(System.out::println);
//        System.out.println("-------------");
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(list);
//      //将流的每个值都换成另一个流，然后把所有的流变成一个流
//        arrayList.stream().flatMap(Stream::of).forEach(System.out::println);
//        System.out.println("-------------");
        
        //3 排序
        //自然排序
        list.stream().sorted().forEach(System.out::println);
        System.out.println("-------------");
        
    }
}
