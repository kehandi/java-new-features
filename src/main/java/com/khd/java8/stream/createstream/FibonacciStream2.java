package com.khd.java8.stream.createstream;

import java.util.stream.LongStream;

/**
 * 斐波拉契数列
 */
public class FibonacciStream2 {
    public static void main(String[] args) {
        LongStream longStream = LongStream.generate(new FibonacciSupplier2());
        longStream.limit(10).forEach(System.out::println);
    }
}
