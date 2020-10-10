package com.khd.java8.stream.collect;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Stream可以输出为集合：
 * Stream通过collect()方法可以方便地输出为List、Set、Map，还可以分组输出。
 *
 * Stream的几个常见操作：map()、filter()、reduce()。
 * 这些操作对Stream来说可以分为两类，
 * 一类是转换操作，即把一个Stream转换为另一个Stream，例如map()和filter()，
 * 另一类是聚合操作，即对Stream的每个元素进行计算，得到一个确定的结果，例如reduce()。
 */
public class Main {
    public static void main(String[] args) {
        Stream<Long> s1 = Stream.generate(new NatualSupplier());
        Stream<Long> s2 = s1.map(n -> n * n);
        Stream<Long> s3 = s2.map(n -> n - 1);
        System.out.println(s3); // java.util.stream.ReferencePipeline$3@49476842
        //对于Stream来说，对其进行转换操作并不会触发任何计算！
        //因为s1是一个Long类型的序列，它的元素高达922亿个，但执行上述代码，既不会有任何内存增长，也不会有任何计算，
        //因为转换操作只是保存了转换规则，无论我们对一个Stream转换多少次，都不会有任何实际计算发生。
        //而聚合操作则不一样，聚合操作会立刻促使Stream输出它的每一个元素，并依次纳入计算，以获得最终结果。
        //所以，对一个Stream进行聚合操作，会触发一系列连锁反应：

        //我们对s4进行reduce()聚合计算，会不断请求s4输出它的每一个元素。
        //因为s4的上游是s3，它又会向s3请求元素，导致s3向s2请求元素，s2向s1请求元素，最终，s1从Supplier实例中请求到真正的元素，并经过一系列转换，最终被reduce()聚合出结果。
        //可见，聚合操作是真正需要从Stream请求数据的，对一个Stream做聚合计算后，结果就不是一个Stream，而是一个其他的Java对象。
        Stream<Long> s4 = s3.limit(10);
        Long reduce = s4.reduce(0L, (acc, n) -> acc + n);
//        Long reduce = s4.reduce(0L, Long::sum);
        System.out.println(reduce);
    }
}

/**
 * 提供自然数序列
 */
class NatualSupplier implements Supplier<Long> {
    long n = 0;

    public Long get() {
        n++;
        return n;
    }
}