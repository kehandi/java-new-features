package com.khd.java8.stream.filter;

import java.time.DayOfWeek;
import java.util.stream.Stream;

public class FilterTest2 {
    public static void main(String[] args) {
        /**
         * 打印未来31天（包含当天）所有周六日
         */
        Stream.generate(new LocalDateSupplier())
                .limit(31)
                .filter(ldt -> ldt.getDayOfWeek() == DayOfWeek.SATURDAY || ldt.getDayOfWeek() == DayOfWeek.SUNDAY)
                .forEach(System.out::println);
    }
}

