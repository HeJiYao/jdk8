package com.hejiyao.demo.jdk8.time;

import java.time.LocalDate;

/**
 * @author He_Ji_Yao
 */
public class LocalDateTest {
    public static void main(String[] args) {
        //获取当前日期
        System.out.println("获取当前日期");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        
    }
}
