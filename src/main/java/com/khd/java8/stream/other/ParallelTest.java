package com.khd.java8.stream.other;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 并行
 * 通常情况下，对Stream的元素进行处理是单线程的，即一个一个元素进行处理。但是很多时候，我们希望可以并行处理Stream的元素，因为在元素数量非常大的情况，并行处理可以大大加快处理速度。
 *
 * 把一个普通Stream转换为可以并行处理的Stream非常简单，只需要用parallel()进行转换：
 */
public class ParallelTest {

    public static void main(String[] args) {
        IntStream s = IntStream.generate(new IntSupplier() {
            int n = 0;
            @Override
            public int getAsInt() {
                return n++;
            }
        });
        long start = System.currentTimeMillis();
        s.limit(200000000)
                .parallel() // 变成一个可以并行处理的Stream
                .sorted() // 可以进行并行排序
                .toArray();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        // 经过parallel()转换后的Stream只要可能，就会对后续操作进行并行处理。我们不需要编写任何多线程代码就可以享受到并行处理带来的执行效率的提升。
    }
}
