package com.hejiyao.demo.jdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author He_Ji_Yao
 */
public class LambdaTest {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("哈哈哈");
        runnable.run();
        
        Comparable<Integer> comparable = Integer::intValue;
        int i = comparable.compareTo(11);
        System.out.println(i);
        
        Comparator<Integer> comparator = Integer::compareTo;
        System.out.println(comparator.compare(11, 12));
        
        Function<Double, Long> function = Math::round;
        System.out.println(function.apply(14.9));
        
        Comparator<String> comparator1 = String::compareTo;
        System.out.println(comparator1.compare("asd", "asdas"));
        
        BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("a", "a"));
    
        Supplier<String> stringSupplier = String::new;
        System.out.println(stringSupplier.get().isEmpty());
        
        Function<String,String> stringFunction = String::new;
        System.out.println(stringFunction.apply("aba"));
    
        Function<Integer,String[]> function1 = String[]::new;
        System.out.println(Arrays.toString(function1.apply(6)));
        
        
    }
}
