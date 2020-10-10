package com.khd.java8.stream.map;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class MapTest2 {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        String[] array = new String[]{" 2019-12-31 ", "2020 - 01-09 ", "2020- 05 - 01 ", "2022 - 02 - 01",
                " 2025-01 -01"};
        // 请使用map把String[]转换为LocalDate并打印:
        Arrays.stream(array)
                .map(str -> str.replace(" ", ""))
                .map(str -> LocalDate.parse(str, dateTimeFormatter))
                .forEach(System.out::println);

    }
}
