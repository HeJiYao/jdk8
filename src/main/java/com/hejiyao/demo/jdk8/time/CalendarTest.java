package com.hejiyao.demo.jdk8.time;

import java.util.Calendar;
import java.util.Date;

/**
 * jdk1.8的之前Data缺点
 *  可变性:像日期和时间这样的类应该是不可变的。
 *  偏移性:Date中的年份是从1900开始的，而月份都从O开始。
 *  格式化:格式化只对Date有用，Calendar则不行。
 *  此外，它们也不是线程安全的;不能处理闰秒等。
 * @author He_Ji_Yao
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //获取当前年份
        System.out.println("获取当前年份");
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        //获取当前月份
        System.out.println("获取当前月份");
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month); //0~11
        //获取当前天数
        //等于Calendar.DATE
        System.out.println("获取当前天数");
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);
        //获取当前年份的天数
        System.out.println("获取当前年份的天数");
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);
    
        System.out.println("获取修改后的天数");
        calendar.set(Calendar.DAY_OF_MONTH,22);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);
    
        System.out.println("获取添加后的天数");
        calendar.add(Calendar.DAY_OF_MONTH,3);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);
        
        //转换为Date
        Date date = calendar.getTime();
        System.out.println(date);
        
        //设置时间
        date = new Date();
        calendar.setTime(date);
        date = calendar.getTime();
        System.out.println(date);
        
    }
}
