package com.hejiyao.demo.jdk8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author He_Ji_Yao
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
//        //转换
//        String format = dateTimeFormatter.format(localDateTime);
//        System.out.println(format);
//        //解析
//        TemporalAccessor parse = dateTimeFormatter.parse("2021-07-27T10:07:18.029");
//        System.out.println(parse);
        
        //本地化相关的格式
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
//        String format = dateTimeFormatter.format(localDateTime);
//        System.out.println(format);//2021年7月27日 上午10时20分38秒

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//        String format = dateTimeFormatter.format(localDateTime);
//        System.out.println(format);//21-7-27 上午10:31

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//        String format = dateTimeFormatter.format(localDateTime);
//        System.out.println(format);//2021-7-27 10:31:38
    
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        String format = dateTimeFormatter.format(localDate);
//        System.out.println(format);//2021年7月27日 星期二
    
        //自定义的格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);//2021-07-27 11:00:53
    }
}
