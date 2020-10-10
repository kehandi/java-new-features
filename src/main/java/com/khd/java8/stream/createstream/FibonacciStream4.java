package com.khd.java8.stream.createstream;

import java.util.Arrays;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciStream4 {

    public static void main(String[] args) {
        //  生成 整形数组，在通过flatmap 转换成一个集合输出
        Stream.iterate(new Integer[]{0, 1}, t -> new Integer[]{t[0] + t[1], t[0] + t[1] + t[1]}) // 1
                .flatMap(Arrays::stream) // flatMap 数据， 将数组元素转化成stream //2
                .limit(10) // 默认是无线长度，所以要给出限制
                .forEach(System.out::println);
    }
}
