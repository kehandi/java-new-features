package com.khd.java8.stream.other;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 跳过
 */
public class SkipTest {
    public static void main(String[] args) {
        List<String> collect = List.of("A", "B", "C", "D", "E", "F")
                .stream()
                .skip(2) // 跳过A, B
                .limit(3) // 截取C, D, E
                .collect(Collectors.toList());// [C, D, E]
        System.out.println(collect);
    }
}
