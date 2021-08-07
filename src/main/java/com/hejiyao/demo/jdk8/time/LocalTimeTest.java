package com.hejiyao.demo.jdk8.time;

import java.time.LocalTime;

/**
 * @author He_Ji_Yao
 */
public class LocalTimeTest {
    public static void main(String[] args) {
        //获取当前时间
        System.out.println("获取当前时间");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
