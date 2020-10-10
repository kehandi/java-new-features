package com.khd.java8.stream.filter;

import java.util.stream.IntStream;

public class FilterTest1 {

    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}
