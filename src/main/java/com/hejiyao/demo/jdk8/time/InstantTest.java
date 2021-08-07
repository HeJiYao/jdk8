package com.hejiyao.demo.jdk8.time;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author He_Ji_Yao
 */
public class InstantTest {
    public static void main(String[] args) {
        //获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);
        //根据不同的地区设置偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        //获取对应的毫秒数
        long milli = instant.toEpochMilli();
        System.out.println(milli);
        //根据毫秒数创建对象
        Instant ofEpochMilli = Instant.ofEpochMilli(1627346671232L);
        System.out.println(ofEpochMilli);
    }
}
