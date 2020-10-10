package com.khd.java8.stream.other;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 排序
 */
public class SortedTest {

    public static void main(String[] args) {
//        List<String> list = List.of("Orange", "apple", "Banana")
//                .stream()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(list);

        List<String> list = List.of("Orange", "apple", "Banana")
                .stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
