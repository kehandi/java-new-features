package com.khd.java8.stream.createstream;

import java.util.function.Supplier;
import java.util.function.IntSupplier;

public class FibonacciSupplier implements Supplier<Integer> {

    int current = 0;
    int next = 1;

    @Override
    public Integer get() {
        int p = current;
        int changeNext = current + next;
        current = next;
        next = changeNext;
        return p;
    }
}

// 直接用IntSupplier的写法
/*public class FibonacciSupplier implements IntSupplier {

    int pre = 0;
    int current = 1;

    @Override
    public int getAsInt() {
        int p = pre;
        int next = pre + current;
        pre = current;
        current = next;
        return p;
    }
}*/
