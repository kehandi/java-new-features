package com.khd.java8.stream.other;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatTest {
    public static void main(String[] args) {
        Stream<String> s1 = List.of("A", "B", "C").stream();
        Stream<String> s2 = List.of("D", "E").stream();
        // 合并:
        Stream<String> s = Stream.concat(s1, s2);
        System.out.println(s.collect(Collectors.toList())); // [A, B, C, D, E]
    }
}
