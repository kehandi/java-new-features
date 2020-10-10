package com.khd.java8.stream.map;

import java.util.stream.Stream;

public class MapTest1 {
    public static void main(String[] args) {
        Stream.of("  Apple ", " pear ", " ORANGE", " BaNaNa ")
                .map(String::trim) // 去空格
                .map(String::toLowerCase) // 变小写
                .sorted(String::compareTo) // 排序
                .forEach(System.out::println); // 打印

    }
}
