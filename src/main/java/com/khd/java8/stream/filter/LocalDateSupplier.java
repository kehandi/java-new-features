package com.khd.java8.stream.filter;

import java.time.LocalDate;
import java.util.function.Supplier;

public class LocalDateSupplier implements Supplier<LocalDate> {
//    LocalDate start = LocalDate.of(2020, 1, 1);
    LocalDate start = LocalDate.now();
    int n = 0;
    public LocalDate get() {
        return start.plusDays(n++);
    }
}