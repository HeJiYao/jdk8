package com.hejiyao.demo.jdk8.time;

import java.time.LocalDateTime;

/**
 * @author He_Ji_Yao
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        //获取当前日期时间
        System.out.println("获取当前日期时间");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //通过设置时间方式创建日期时间对象
        System.out.println("通过设置时间方式创建日期时间对象");
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,10,06,13,57,41);
        System.out.println(localDateTime1);
        
        //获取具体日期时间
        System.out.println("获取年份");
        System.out.println(localDateTime.getYear());
        System.out.println("获取月份");
        System.out.println("获取英文月份");
        System.out.println(localDateTime.getMonth());
        System.out.println("获取数字月份");
        System.out.println(localDateTime.getMonthValue());
        System.out.println("获取星期几");
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println("根据年份获取当前天数");
        System.out.println(localDateTime.getDayOfYear());
        System.out.println("根据月份获取当前天数");
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println("获取当前小时");
        System.out.println(localDateTime.getHour());
        System.out.println("获取当前分钟");
        System.out.println(localDateTime.getMinute());
        System.out.println("获取当前秒");
        System.out.println(localDateTime.getSecond());
        
        
    }
}
