package com.khd.java8.stream.createstream;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class FibonacciStream3 {

    public static void main(String[] args) {
        // 通过IntSupplier  和 stream.generate 生成
        IntSupplier is = new IntSupplier() {
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
        };

        IntStream.generate(is).limit(10).forEach(System.out::println);
    }
}
