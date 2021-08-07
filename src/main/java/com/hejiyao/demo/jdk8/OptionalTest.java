package com.hejiyao.demo.jdk8;

import java.util.Optional;

/**
 * @author He_Ji_Yao
 */
public class OptionalTest {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional);
        //非空判断，空返回方法里的参数，则返回内部的封装
        System.out.println(optional.orElse("sada"));
    }
}
