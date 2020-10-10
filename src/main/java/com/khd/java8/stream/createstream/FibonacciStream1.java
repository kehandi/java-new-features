package com.khd.java8.stream.createstream;

import java.util.stream.Stream;

/**
 * 斐波拉契数列
 */
public class FibonacciStream1 {
    public static void main(String[] args) {
        Stream<Integer> fStream = Stream.generate(new FibonacciSupplier());
        fStream.limit(10).forEach(System.out::println);
    }

//    public static void main(String[] args) {
//        IntStream fStream = IntStream.generate(new FibonacciSupplier());
//        fStream.limit(10).forEach(System.out::println);
//    }
}
