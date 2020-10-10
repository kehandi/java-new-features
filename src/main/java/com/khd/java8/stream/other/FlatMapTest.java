package com.khd.java8.stream.other;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 因此，所谓flatMap()，是指把Stream的每个元素（这里是List）映射为Stream，然后合并成一个新的Stream：
 */
public class FlatMapTest {

    public static void main(String[] args) {
        Stream<List<Integer>> s = Stream.of(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));
        Stream<Integer> integerStream = s.flatMap(list -> list.stream());
        integerStream.forEach(System.out::println);
    }
}
