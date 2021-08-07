package com.hejiyao.demo.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 终止操作
 *
 * @author He_Ji_Yao
 */
public class StreamMatchSearchTest {
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
        //1 查找和匹配
        //检查是否匹配所有元素
        System.out.println(list.stream().allMatch(l -> l > 5));
        System.out.println("-------------");
        //只有一个匹配就可以
        System.out.println(list.stream().anyMatch(l -> l > 5));
        System.out.println("-------------");
        //是否存在没匹配的元素
        System.out.println(list.stream().noneMatch(l -> l == 5));
        System.out.println("-------------");
        //获取第一个元素
        System.out.println(list.stream().findFirst());
        System.out.println("-------------");
        //返回当前流中的任意元素
        System.out.println(list.parallelStream().findAny());
        System.out.println("-------------");
        //返回流中元素的个数
        System.out.println(list.stream().filter(l -> l > 5).count());
        System.out.println("-------------");
        //返回流中最大值
        System.out.println(list.stream().map(Integer::doubleValue).max(Double::compare));
        System.out.println("-------------");
        //返回流中最小值
        System.out.println(list.stream().min(Integer::compare));
        System.out.println("-------------");
        //迭代器
        list.stream().forEach(System.out::println);
        System.out.println("-------------");
        
        //2 归约
        //执行聚合操作
        System.out.println(list.stream().reduce(0, Integer::sum));
        System.out.println("-------------");
        //同上，返回Optional
        System.out.println(list.stream().reduce(Integer::sum));
        System.out.println("-------------");
        
        //3 收集
        //将流转换为其他形式
        list.stream().filter(l -> l > 5).sorted().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-------------");
        
    }
}
