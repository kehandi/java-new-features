package com.khd.java8.stream.other;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 去重
 */
public class DistinctTest {

    public static void main(String[] args) {
        List<String> collect = List.of("A", "B", "A", "C", "B", "D")
                .stream()
                .distinct()
                .collect(Collectors.toList()); // [A, B, C, D]
        System.out.println(collect);
    }
}
