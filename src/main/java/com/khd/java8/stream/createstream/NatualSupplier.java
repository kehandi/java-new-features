package com.khd.java8.stream.createstream;

import java.util.function.Supplier;

/**
 * 自然数
 */
public class NatualSupplier implements Supplier<Integer> {
    int n = 0;

    public Integer get() {
        n++;
        return n;
    }
}