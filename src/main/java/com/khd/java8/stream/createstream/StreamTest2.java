package com.khd.java8.stream.createstream;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * 创建 Stream
 */
public class StreamTest2 {


    /**
     * Stream.of()
     */
    /*public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C", "D");
        // forEach()方法相当于内部循环调用，
        // 可传入符合Consumer接口的void accept(T t)的方法引用：
        stream.map(n -> n + n).limit(3).forEach(System.out::println);
    }*/

    /**
     * 基于数组或Collection
     */
    /*public static void main(String[] args) {
        Stream<String> stream1 = Arrays.stream(new String[]{"A", "B", "C"});
//        Stream<String> stream2 = List.of("X", "Y", "Z").stream(); // java9用法
        Stream<String> stream2 = Arrays.asList("X", "Y", "Z").stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }*/

    /**
     * 基于Supplier
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Stream<Integer> natual = Stream.generate(new NatualSupplier());
        // 注意：无限序列必须先变成有限序列再打印:
        natual.forEach(n->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sdf.format(new Date()) + ":  " + n);
        });
    }

}
