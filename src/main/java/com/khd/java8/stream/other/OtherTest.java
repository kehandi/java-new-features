package com.khd.java8.stream.other;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 其他聚合方法
 * 除了reduce()和collect()外，Stream还有一些常用的聚合方法：
 * <p>
 * count()：用于返回元素个数；
 * max(Comparator<? super T> cp)：找出最大元素；
 * min(Comparator<? super T> cp)：找出最小元素。
 * 针对IntStream、LongStream和DoubleStream，还额外提供了以下聚合方法：
 * <p>
 * sum()：对所有元素求和；
 * average()：对所有元素求平均数。
 * 还有一些方法，用来测试Stream的元素是否满足以下条件：
 * <p>
 * boolean allMatch(Predicate<? super T>)：测试是否所有元素均满足测试条件；
 * boolean anyMatch(Predicate<? super T>)：测试是否至少有一个元素满足测试条件。
 * 最后一个常用的方法是forEach()，它可以循环处理Stream的每个元素，我们经常传入System.out::println来打印Stream的元素：
 *
 *
 * 小结
 * Stream提供的常用操作有：
 *
 * 转换操作：map()，filter()，sorted()，distinct()；
 *
 * 合并操作：concat()，flatMap()；
 *
 * 并行处理：parallel()；
 *
 * 聚合操作：reduce()，collect()，count()，max()，min()，sum()，average()；
 *
 * 其他操作：allMatch(), anyMatch(), forEach()。
 *
 */
public class OtherTest {
    public static void main(String[] args) {

//        Stream<Integer> integerStream = Stream.of(23, 34, 92, 29, 46);
//        long count = integerStream.count();
//        System.out.println(count);

//        Optional<Integer> max = Stream.of(23, 34, 92, 29, 46).max(Integer::compareTo);
//        System.out.println(max.get());

//        int sum = IntStream.of(23, 34, 92, 29, 46).sum();
//        System.out.println(sum);

//        OptionalDouble avg = IntStream.of(23, 34, 92, 29, 46).average();
//        System.out.println(avg);

//        Stream<Integer> stream = Stream.of(23, 34, 92, 29, 46);
//        boolean b = stream.anyMatch(m -> m == 46);
//        System.out.println(b);

        Stream<String> s = List.of("a", "b", "c").stream();
        s.forEach(str -> {
            System.out.println("Hello, " + str);
        });

    }
}
