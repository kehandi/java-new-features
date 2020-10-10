package com.khd.java8.stream.reduce;

import java.util.stream.Stream;

public class ReduceTest1 {

    public static void main(String[] args) {
//        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0, (acc, n) -> acc + n);
//        System.out.println(sum); // 45

        int s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(1, (acc, n) -> acc * n);
        System.out.println(s); // 362880
    }
}
