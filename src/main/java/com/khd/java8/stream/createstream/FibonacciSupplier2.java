package com.khd.java8.stream.createstream;

import java.util.function.LongSupplier;

public class FibonacciSupplier2 implements LongSupplier {
    long m = 0;
    long n = 1;

    public long getAsLong() {
        long temp = n;
        n = m + n;
        m = temp;
        return n;
    }
}
