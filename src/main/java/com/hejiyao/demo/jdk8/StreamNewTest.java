package com.hejiyao.demo.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream创建方式
 *
 * @author He_Ji_Yao
 */
public class StreamNewTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        //创建方式1
        //顺序流
        Stream stream = list.stream();
        //并行流
        Stream parallelStream = list.parallelStream();
        
        //创建方式2
        Stream<Object> stream1 = Arrays.stream(list.toArray());
        
        //创建方式3
        Stream<List> listStream = Stream.of(list);
        
        //创建方式4
        //无线流
        //迭代
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        
        //生成
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
        
        
    }
}
